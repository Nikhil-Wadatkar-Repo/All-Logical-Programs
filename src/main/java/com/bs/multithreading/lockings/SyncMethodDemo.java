package com.bs.multithreading.lockings;

class InfoDetails {

    public synchronized void displayName(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }

    }
}

class Thread1 extends Thread {
    InfoDetails infoDetails;
    String name;

    public Thread1(InfoDetails t, String name) {
        this.infoDetails = t;
        this.name = name;
    }

    @Override
    public void run() {
        infoDetails.displayName(name);
    }
}

class Thread2 extends Thread {
    InfoDetails infoDetails;
    String name;

    public Thread2(InfoDetails t, String name) {
        this.infoDetails = t;
        this.name = name;
    }

    @Override
    public void run() {
        infoDetails.displayName(name);
    }
}

public class SyncMethodDemo {
    public static void main(String[] args) {
        InfoDetails infoDetails = new InfoDetails();
        Thread t1 = new Thread1(infoDetails, "Ankur");
        Thread t2 = new Thread1(infoDetails, "Nikhil");
        t1.start();
        t2.start();
    }

}