package org.example.threads;

import org.example.threads.workers.CountDownWorker;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        int taskCount = 3;
        CountDownLatch latch = new CountDownLatch(taskCount);
        ExecutorService executorService = Executors.newFixedThreadPool(taskCount);
        List<String> failures = new CopyOnWriteArrayList<>();

        for (int i = 1; i <= taskCount; i++) {
            executorService.execute(new CountDownWorker(i, latch, failures));
        }

        boolean allTasksCompleted = latch.await(3, TimeUnit.SECONDS);

        if (!allTasksCompleted) {
            System.out.println("Timeout reached. Some workers are still running.");
        } else if (!failures.isEmpty()) {
            System.out.println("All workers finished, but some failed: " + failures);
        } else {
            System.out.println("All workers completed successfully.");
        }

        executorService.shutdownNow();
    }
}
