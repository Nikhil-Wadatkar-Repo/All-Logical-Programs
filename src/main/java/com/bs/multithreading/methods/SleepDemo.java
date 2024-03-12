package com.bs.multithreading.methods;


public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread " + i);
            Thread.sleep(1000);
        }

    }
}
