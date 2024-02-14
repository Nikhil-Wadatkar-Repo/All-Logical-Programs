package com.bs.multithreading;


class Thread1 implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 13; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

    }
}

public class YeildDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Thread1());
        t1.start();
        t1.yield();
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }

}
