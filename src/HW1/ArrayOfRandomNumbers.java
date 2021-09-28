package HW1;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        int[] arrayOfRandomNumbers = new int[10];
        double average = 0;
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = 10 + (int) (Math.random() * 11);
            average += arrayOfRandomNumbers[i];
        }
        System.out.println(average / arrayOfRandomNumbers.length);
    }
}
