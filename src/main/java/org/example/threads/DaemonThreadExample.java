package org.example.threads;

public class DaemonThreadExample {

    private static class BackgroundTask extends Thread {
        public void run() {
            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static class UserTask extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("User thread step " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        BackgroundTask daemonThread = new BackgroundTask();
        daemonThread.setDaemon(true);

        UserTask userThread = new UserTask();

        daemonThread.start();
        userThread.start();
    }
}
