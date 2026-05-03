package org.example.threads.Executor;

import org.example.threads.workers.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new Task(i));
        }
        executorService.shutdown();
    }
}
