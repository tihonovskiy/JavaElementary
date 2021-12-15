package HW17;

public class ValueCalculator {

    private static final int SIZE = 30000000;
    private static final int HALF = SIZE / 2;

    private final float[] arr = new float[SIZE];

    public void doCalc() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10.0F;
        }

        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        Thread t0 = new Thread(getCalcOperation(arr1));
        Thread t1 = new Thread(getCalcOperation(arr2));

        t0.start();
        t1.start();

        try {
            t0.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        long end = System.currentTimeMillis() - start;

        System.out.println("operation took = " + end);
    }

    private Runnable getCalcOperation(float[] arr) {
        return new Runnable() {
            @Override
            public void run() {
                doCalc(arr);
            }
        };
    }

    private void doCalc(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}