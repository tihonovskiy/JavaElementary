package HW7;

public class Cat implements Participant {
    private int lengthLimitation;
    private int heightLimitation;
    private String name = "Cat";

    public Cat(int lengthLimitation, int heightLimitation) {
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
        System.out.print("Cat is running ");
    }

    @Override
    public void jump() {
        System.out.print("Cat is jumping ");
    }
}
