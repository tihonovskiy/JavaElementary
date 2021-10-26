package HW7;

public class Human implements Participant {
    private int lengthLimitation;
    private int heightLimitation;
    private String name = "Human";

    public Human(int lengthLimitation, int heightLimitation) {
        this.lengthLimitation = lengthLimitation;
        this.heightLimitation = heightLimitation;
    }

    public int getLengthLimitation() {
        return lengthLimitation;
    }

    public int getHeightLimitation() {
        return heightLimitation;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.print("Human is running ");
    }

    @Override
    public void jump() {
        System.out.print("Human is jumping ");
    }
}
