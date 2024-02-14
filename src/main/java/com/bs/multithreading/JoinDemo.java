package com.bs.multithreading;


class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child  thread : " + i);
        }
    }
}

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread2();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread : " + i);
            if (i == 3) t1.join();
        }

    }
}


//output:
//main thread : 0
//main thread : 1
//main thread : 2
//main thread : 3
//Child  thread : 0
//Child  thread : 1
//Child  thread : 2
//Child  thread : 3
//Child  thread : 4
//Child  thread : 5
//Child  thread : 6
//Child  thread : 7
//Child  thread : 8
//Child  thread : 9
//main thread : 4


