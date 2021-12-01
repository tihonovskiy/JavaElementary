package HW15;

public class Orange extends Fruit {
    private String gradeOrange;
    private final float weight = 1.5F;

    public Orange(String gradeOrange) {
        this.gradeOrange = gradeOrange;
    }

    public String getGradeOrange() {
        return gradeOrange;
    }

    public float getWeight() {
        return weight;
    }
}
