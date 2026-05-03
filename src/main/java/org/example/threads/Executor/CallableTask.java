package org.example.threads.Executor;

import java.util.concurrent.Callable;

class CallableTask implements Callable<String> {
    private final int id;

    CallableTask(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Executable " + id + " Thread: " + Thread.currentThread().getName());
        Thread.sleep(1000);
        return "Id: " + id;
    }
}
