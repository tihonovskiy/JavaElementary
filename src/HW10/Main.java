package HW10;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        System.out.println("invalidSizeArray:");
        System.out.println(tryArray(calculator, new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        }));

        System.out.println("invalidDataArray");
        System.out.println(tryArray(calculator, new String[][]{
                {"1", "1", "1", "1"},
                {"qwer", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        }));

        System.out.println("validArray");
        System.out.println(tryArray(calculator, new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        }));

    }

    static int tryArray(ArrayValueCalculator calculator, String[][] array) {
        try {
            return calculator.doCalc(array);
        } catch (MySizeArrayException ex) {
            ex.printStackTrace();
            System.out.println("Array has incorrect size!!!");
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
            System.out.println("Array has incorrect value!!!");
        }

        return 0;
    }
}
