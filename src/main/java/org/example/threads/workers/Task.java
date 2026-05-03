package org.example.threads.workers;

class Task implements Runnable {
    private final int id;

    Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Executable " + id + " Thread: " + Thread.currentThread().getName());
    }
}
