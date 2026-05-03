package org.example.threads;

import org.example.threads.workers.BarrierWorker;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        int taskCount = 3;
        CyclicBarrier barrier = new CyclicBarrier(taskCount, () ->
                System.out.println("All workers reached barrier. Starting next step.")
        );
        ExecutorService executorService = Executors.newFixedThreadPool(taskCount);

        for (int i = 1; i <= taskCount; i++) {
            executorService.execute(new BarrierWorker(i, barrier));
        }

        executorService.shutdown();
    }
}
