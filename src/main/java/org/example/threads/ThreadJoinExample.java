package org.example.threads;

public class ThreadJoinExample {

    private static class Task extends Thread {
        private final String taskName;

        private Task(String taskName) {
            this.taskName = taskName;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(taskName + " step " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");

        task1.start();
        task1.join();

        task2.start();
        task2.join();

        System.out.println("Both tasks completed");
    }
}
