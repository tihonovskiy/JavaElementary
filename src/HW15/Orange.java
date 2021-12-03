package HW15;

public class Orange implements Fruit {
    private String gradeOrange;
    private final float weight = 1.5F;

    public Orange(String gradeOrange) {
        this.gradeOrange = gradeOrange;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "gradeOrange='" + gradeOrange + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
