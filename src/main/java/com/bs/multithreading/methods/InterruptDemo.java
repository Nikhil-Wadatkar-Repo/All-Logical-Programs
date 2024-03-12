package com.bs.multithreading.methods;

class Thread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i am lazy thread");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("i got interrupted");
        }

    }
}

public class InterruptDemo {
    public static void main(String[] args) {
        Thread t = new Thread3();
        t.start();
        t.interrupt();
        System.out.println("end of main thread");
    }
}

//output
//end of main thread
//    iamlazy thread
//    iamlazy thread
//    iamlazy thread
//    iamlazy thread
//    iamlazy thread
//    i got interrupted