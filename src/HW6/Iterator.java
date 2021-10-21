package HW6;

public class Iterator {
    private int[][] arr;
    private static int count = -1;

    public Iterator(int[][] arr) {
        this.arr = arr;
    }

    public boolean hasNext() {
        if (getSizeArray(this.arr) > count+1) {
            return true;
        } else {
            return false;
        }
    }

    public int next() {
        return getSotArray(this.arr)[count];
    }

    private static int getSizeArray(int[][] arr) {
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            size += arr[i].length;
        }

        return size;
    }

    private static int[] getSotArray(int[][] arr) {
        int[] result = new int[getSizeArray(arr)];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[index] = arr[i][j];
                index++;
            }
        }

        for(int i = result.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (result[j] > result[j + 1]) {
                    int tmp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = tmp;
                }
            }
        }

        count++;
        return result;
    }
}
