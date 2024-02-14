package com.bs.multithreading;

class Thread3 extends Thread {
    @Override
    public void run() {
        for (int y = 0; y < 10; y++) {
            System.out.println("Child thread " + y);
        }
    }
}

public class InterruptDemo {
    public static void main(String[] args) {
        Thread t=new Thread3();
        t.start();
        t.interrupt();
        for (int y = 0; y < 10; y++) {
            System.out.println("main thread " + y);
        }
    }
}
