package org.example.threads;

public class ThreadByExtending {

    private static class Hello extends Thread {
        public void run() {
            for(int i=0;i<100;i++){
                System.out.println("Hello");
                try {

                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    private static class Hi extends Thread {
        public void run() {
            for(int i=0;i<100;i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args){
        Hello obj1 =new Hello();
        Hi obj2 = new Hi();
        System.out.println(obj1.getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
