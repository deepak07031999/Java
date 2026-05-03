package org.example.threads.Executor;

import org.example.threads.workers.Task;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleWithFixedDelay(new Task(0), 2, 1, TimeUnit.SECONDS);

        Thread.sleep(7000);
        executorService.shutdown();
    }
}
