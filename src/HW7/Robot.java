package HW7;

public class Robot implements Participant {
    private int lengthLimitation;
    private int heightLimitation;
    private String name = "Robot";

    public Robot(int lengthLimitation, int heightLimitation) {
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
        System.out.print("Robot is running ");
    }

    @Override
    public void jump() {
        System.out.print("Robot is running ");
    }
}
