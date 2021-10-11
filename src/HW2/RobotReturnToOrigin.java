package HW2;

// https://leetcode.com/problems/robot-return-to-origin/
// Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves1 = "UD"; //true
        String moves2 = "LL"; //false
        String moves3 = "RRDD"; //false
        String moves4 = "LDRRLRUULR"; //false
        String moves5 = "RRLLW"; //false
        String moves6 = "RULDRULDRULDRULDRULD"; //true

        System.out.println(judgeCircle(moves1));
        System.out.println(judgeCircle(moves2));
        System.out.println(judgeCircle(moves3));
        System.out.println(judgeCircle(moves4));
        System.out.println(judgeCircle(moves5));
        System.out.println(judgeCircle(moves6));
    }

    public static boolean judgeCircle(String moves) {

        if (moves.length() == 0) {
            return false;
        }

        int countR = 0;
        int countL = 0;
        int countU = 0;
        int countD = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                countR++;
            } else if (moves.charAt(i) == 'L') {
                countL++;
            } else if (moves.charAt(i) == 'U') {
                countU++;
            } else if (moves.charAt(i) == 'D') {
                countD++;
            } else {
                return false;
            }
        }

        if (countR == countL && countU == countD) {
            return true;
        }

        return false;
    }
}
