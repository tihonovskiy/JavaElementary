package HW20;

import java.lang.reflect.Method;

public class TestRunner {
    static void start(Class className) throws Exception {
        Object obj = className.getDeclaredConstructor().newInstance();
        int beforeMethodCount = 0;
        int afterMethodCount = 0;

        for (Method method : className.getDeclaredMethods()) {
            if (method.getAnnotation(BeforeSuite.class) != null) {
                method.invoke(obj);
                beforeMethodCount++;
            }
            if (beforeMethodCount > 1) {
                throw new wrongNumberOfAnnotatedMethods("Class " + obj.getClass() + " contains several methods with Before Annotation");
            }
        }

        for (int i = 1; i <= 10; i++) {
            for (Method method : className.getDeclaredMethods()) {
                if (method.getAnnotation(Test.class) != null && method.getAnnotation(Test.class).priority() == i) {
                    method.invoke(obj);
                }
            }
        }

        for (Method method : className.getDeclaredMethods()) {
            if (method.getAnnotation(AfterSuite.class) != null) {
                method.invoke(obj);
                afterMethodCount++;
            }
            if (afterMethodCount > 1) {
                throw new wrongNumberOfAnnotatedMethods("Class " + obj.getClass() + " contains several methods with After Annotation");
            }
        }
    }

}
