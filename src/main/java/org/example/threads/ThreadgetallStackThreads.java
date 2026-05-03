package org.example.threads;

import java.util.Map;

public class ThreadgetallStackThreads {

    public static void main(String[] args) {
        Map<Thread, StackTraceElement[]> allThreads = Thread.getAllStackTraces();

        for (Thread thread : allThreads.keySet()) {
            System.out.println("Thread name: " + thread.getName());
            System.out.println("Thread state: " + thread.getState());
            System.out.println("Thread priority: " + thread.getPriority());
            System.out.println();
        }
    }
}
