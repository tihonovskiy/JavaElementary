package HW7;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = getParticipant();
        Let[] let = getLet();

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < let.length; j++) {
                if (!let[j].overcome(participants[i])) {
                    System.out.println(participants[i].getName() + " drops out of the competition");
                    break;
                } else if (j == let.length-1) {
                    System.out.println(participants[i].getName() + " passed all obstacles successfully");
                }
            }
        }
    }

    private static Participant[] getParticipant() {
        return new Participant[] {
                new Human(150, 25), new Cat(125, 10),
                new Robot(300, 20), new Human(350, 40),
                new Cat(50, 25), new Robot(500, 500)
        };
    }

    private static Let[] getLet() {
        return new Let[] {
                new Treadmill(100), new Treadmill(200), new Wall(15), new Wall(30)
        };
    }
}
