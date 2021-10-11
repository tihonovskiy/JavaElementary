package HW4;

/*
https://leetcode.com/problems/sort-array-by-parity/
 */

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] intArray = {3, 1, 2, 4, 12, 14, 16, 17, 21, 7, 10, 15, 33, 40, 0};
        int[] sortArray = getSortArrayByParity(intArray);
        for (int i : sortArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] getSortArrayByParity(int[] intArray) {
        int[] result = new int[intArray.length];
        int start = 0;
        int end = intArray.length - 1;

        for (int num : intArray) {
            if (num % 2 == 0) {
                result[start] = num;
                start++;
            } else {
                result[end] = num;
                end--;
            }
        }

        return result;
    }
}
