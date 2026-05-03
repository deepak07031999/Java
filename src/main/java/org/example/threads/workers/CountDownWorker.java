package org.example.threads.workers;

import java.util.List;
import java.util.concurrent.CountDownLatch;

class CountDownWorker implements Runnable {
    private final int workerId;
    private final CountDownLatch latch;
    private final List<String> failures;

    CountDownWorker(int workerId, CountDownLatch latch, List<String> failures) {
        this.workerId = workerId;
        this.latch = latch;
        this.failures = failures;
    }

    @Override
    public void run() {
        try {
            if (workerId == 2) {
                throw new RuntimeException("API call failed");
            }
            if (workerId == 3) {
                Thread.sleep(5000);
            }
            System.out.println("Worker " + workerId + " completed work");
        } catch (Exception e) {
            failures.add("Worker " + workerId + " failed: " + e.getMessage());
        } finally {
            latch.countDown();
        }
    }
}
