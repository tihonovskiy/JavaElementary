package HW10;

public class ArrayValueCalculator {

    public int doCalc(String[][] arrayString) {
        checkArraySize(arrayString);

        int sum = 0;

        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString.length; j++) {
                try {
                    sum += Integer.parseInt(arrayString[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(String.format("Array [%s][%s] does not contain not integer", i, j), ex);
                }
            }
        }

        return sum;
    }

    private void checkArraySize(String[][] arrayString) {
        checkArraySize(arrayString.length);

        for (int i = 0; i < arrayString.length; i++) {
            checkArraySize(arrayString[i].length);
        }
    }

    private void checkArraySize(int size) {
        if (size != 4) {
            throw new MySizeArrayException("Array must be size = 4x4");
        }
    }
}
