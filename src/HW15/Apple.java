package HW15;

public class Apple implements Fruit {
    private String gradeApple;
    public final float weight = 1.0F;

    public Apple(String gradeApple) {
        this.gradeApple = gradeApple;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "gradeApple='" + gradeApple + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
