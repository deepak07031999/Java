package org.example.threads;

public class ThreadByImplementingRunnable {

    private static class Hello implements Runnable {
        public void run() {
            for(int i=0;i<100;i++)
                System.out.println("Hello");
        }
    }

    private static class Hi implements Runnable {
        public void run() {
            for(int i=0;i<100;i++)
                System.out.println("Hi");
        }
    }

    public static void main(String[] args){
        Hello obj1 = new Hello();
        Thread t1 = new Thread(obj1);
        Hi obj2 = new Hi();
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
