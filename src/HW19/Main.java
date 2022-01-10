package HW19;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        PetrolStation petrolStation1 = new PetrolStation(1000);

        new Thread(getRefuelingRunner(petrolStation1, 5)).start();
        new Thread(getRefuelingRunner(petrolStation1, 10)).start();
        new Thread(getRefuelingRunner(petrolStation1, 15)).start();
        new Thread(getRefuelingRunner(petrolStation1, 20)).start();
        new Thread(getRefuelingRunner(petrolStation1, 30)).start();
        new Thread(getRefuelingRunner(petrolStation1, 100)).start();
        new Thread(getRefuelingRunner(petrolStation1, 200)).start();
        new Thread(getRefuelingRunner(petrolStation1, 300)).start();
        //new Thread(getRefuelingRunner(petrolStation1, 400)).start(); // exception

        ThreadSafeList threadSafeList = new ThreadSafeList();
        new Thread(getThreadSafeListRunner(threadSafeList)).start();
        new Thread(getThreadSafeListRunner(threadSafeList)).start();
        new Thread(getThreadSafeListRunner(threadSafeList)).start();
    }

    static Runnable getThreadSafeListRunner(ThreadSafeList threadSafeList) {
        return new Runnable() {
            @Override
            public void run() {
                threadSafeList.add("First");
                threadSafeList.add("Second");
                threadSafeList.add("End");
                System.out.println(threadSafeList.get(1));
                threadSafeList.remove(1);
                System.out.println(threadSafeList.get());
            }
        };
    }

    static Runnable getRefuelingRunner(PetrolStation petrolStation, double amount) {
        return new Runnable() {
            @Override
            public void run() {
                petrolStation.doRefuel(amount);
            }
        };
    }

    public static void doSleep(int a, int b) {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(a, b));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

    
