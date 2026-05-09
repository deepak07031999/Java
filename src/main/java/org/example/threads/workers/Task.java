package org.example.threads.workers;

public class Task implements Runnable {
    private final int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Executable " + id + " Thread: " + Thread.currentThread().getName());
    }
}
