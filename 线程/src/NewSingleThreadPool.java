import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class NewSingleThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i < 10; i++) {
            final int index=i;
            scheduledExecutorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
    }
}
