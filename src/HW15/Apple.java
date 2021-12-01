package HW15;

public class Apple extends Fruit {
    private String gradeApple;
    public final float weight = 1.0F;

    public Apple(String gradeApple) {
        this.gradeApple = gradeApple;
    }

    public String getGradeApple() {
        return gradeApple;
    }

    public float getWeight() {
        return weight;
    }
}
