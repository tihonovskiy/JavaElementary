package HW3;

/*
2) Задан массив случаных чисел типа int в котором есть положительные и отрицательные числа.
Написать метод который вернет массив квадратов этих чисел, отсортированных по возрастанию.
*/

import java.util.Random;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        int[] intArray = new int[12];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(20) - 10;
        }

        int[] resultArray = sortArray(intArray);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
    }

    public static int[] sortArray(int[] intArray) {
        int[] resultArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            resultArray[i] = intArray[i] * intArray[i];
        }

        for (int i = resultArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (resultArray[j] > resultArray[j + 1]) {
                    int tmp = resultArray[j];
                    resultArray[j] = resultArray[j + 1];
                    resultArray[j + 1] = tmp;
                }
            }
        }

        return resultArray;
    }

}
