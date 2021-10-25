package HW7;

public class Wall implements Let {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        System.out.print("through the wall");
        if(height < participant.getHeightLimitation()) {
            System.out.println("distance passed successfully");
            return true;
        } else {
            System.out.println("distance not covered, overcame " + participant.getHeightLimitation()
                    + " out of " + height);
            return false;
        }
    }
}
