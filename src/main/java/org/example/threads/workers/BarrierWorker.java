package org.example.threads.workers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BarrierWorker implements Runnable {
    private final int workerId;
    private final CyclicBarrier barrier;

    public BarrierWorker(int workerId, CyclicBarrier barrier) {
        this.workerId = workerId;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker " + workerId + " completed step 1");
            barrier.await(3, TimeUnit.SECONDS);
            System.out.println("Worker " + workerId + " started step 2");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Worker " + workerId + " interrupted");
        } catch (BrokenBarrierException e) {
            System.out.println("Worker " + workerId + " could not continue because barrier is broken");
        } catch (TimeoutException e) {
            System.out.println("Worker " + workerId + " timed out while waiting at barrier");
        }
    }
}
