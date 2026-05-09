package org.example.threads;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> exchangeData(exchanger, "Worker 1", "Data from worker 1"));
        executorService.execute(() -> exchangeData(exchanger, "Worker 2", "Data from worker 2"));

        executorService.shutdown();
    }

    private static void exchangeData(Exchanger<String> exchanger, String workerName, String data) {
        try {
            System.out.println(workerName + " has: " + data);
            String receivedData = exchanger.exchange(data);
            System.out.println(workerName + " received: " + receivedData);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(workerName + " interrupted while exchanging data");
        }
    }
}
