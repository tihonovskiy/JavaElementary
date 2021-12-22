package HW18;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CountDownTime {

    public void start(long minutes) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        System.out.println("START");
        executorService.scheduleAtFixedRate(
                new Runnable() {
                    long secondsValue = minutes * 60;

                    @Override
                    public void run() {
                        System.out.println(String.format("%02d:%02d:%02d", TimeUnit.SECONDS.toHours(secondsValue),
                                TimeUnit.SECONDS.toMinutes(secondsValue) - TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(secondsValue)),
                                TimeUnit.SECONDS.toSeconds(secondsValue) - TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(secondsValue))));
                        secondsValue--;
                        if (secondsValue == 0) {
                            System.out.println("THE END");
                            executorService.shutdown();
                        }
                    }
                },
                1L,
                1L,
                TimeUnit.SECONDS
        );
    }
}
