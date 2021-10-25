package HW7;

public class Treadmill implements Let {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        System.out.print("on a treadmill ");
        if(length < participant.getLengthLimitation()) {
            System.out.println("distance passed successfully");
            return true;
        } else {
            System.out.println("distance not covered, overcame " + participant.getLengthLimitation()
                    + " out of " + length);
            return false;
        }
    }
}
