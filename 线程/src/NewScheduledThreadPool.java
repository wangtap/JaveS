import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        e.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hh");
            }
        },2, TimeUnit.SECONDS);

    }
}
