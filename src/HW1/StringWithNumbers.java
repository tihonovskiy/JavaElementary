package HW1;

public class StringWithNumbers {
    public static void main(String[] args) {
        System.out.println(getStringWithNumbers());
    }

    public static String getStringWithNumbers() {
        String stringWithNumbers = new String();
        int i = 1;
        while (i <= 30) {
            stringWithNumbers += "(" + i + ")";
            i++;
        }
        return stringWithNumbers;
    }
}
