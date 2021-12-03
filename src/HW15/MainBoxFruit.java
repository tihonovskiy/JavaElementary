package HW15;

import java.util.ArrayList;
import java.util.List;

public class MainBoxFruit {

    public static void main(String[] args) {
        Box<Apple> boxApple1 = new Box<>();
        Box<Apple> boxApple2 = new Box<>();
        Box<Orange> boxOrange1 = new Box<>();
        Box<Orange> boxOrange2 = new Box<>();

        Apple apple1 = new Apple("apple1");
        Apple apple2 = new Apple("apple2");
        Apple apple3 = new Apple("apple3");

        Orange orange1 = new Orange("orange1");
        Orange orange2 = new Orange("orange2");
        Orange orange3 = new Orange("orange3");

        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);

        List<Orange> oranges = new ArrayList<>();
        oranges.add(orange1);
        oranges.add(orange2);
        oranges.add(orange3);

        boxApple1.addFruit(apple1);
        boxApple1.addFruits(apples);

        boxOrange1.addFruit(orange1);
        boxOrange1.addFruits(oranges);

        System.out.println("ApplesBox Weight = " + boxApple1.getWeight());
        System.out.println("OrangeBox Weight = " + boxOrange1.getWeight());

        boxApple2.addFruit(apple2);
        boxApple2.addFruit(apple3);
        boxOrange2.addFruit(orange2);
        boxOrange2.addFruit(orange3);
        boxApple1.merge(boxApple2);
        System.out.println("Marge apple = " + boxApple1);
        boxOrange1.merge(boxOrange2);
        System.out.println("Marge apple = " + boxOrange1);

        System.out.print("boxApple1 compare boxOrange1 = ");
        System.out.println(boxApple1.compare(boxOrange1));
        System.out.print("boxApple1 compare boxApple1 = ");
        System.out.println(boxApple1.compare(boxApple1));
        boxApple2.addFruit(apple2);
        System.out.print("boxApple2 compare boxOrange2 = ");
        System.out.println(boxApple2.compare(boxOrange2));
    }

}
