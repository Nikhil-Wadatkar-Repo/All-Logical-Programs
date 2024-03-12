package com.bs.multithreading.interThreadCommunication;

class Thread4 extends Thread {
	public int age = 0;

	@Override
	public void run() {
		System.out.println("Child Thread");
		synchronized (this) {
			System.out.println("Child thread performing updation");
			for (int i = 0; i < 5; i++)
				age += i;
			System.out.println("child thread calls notify method");
			this.notify();
		}
	}
}

public class InterThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread4 t4 = new Thread4();
		t4.start();
		synchronized (t4) {
			System.out.println("main thread calls wait method on child thread for updation");
			t4.wait();
		}
		System.out.println("value coming from child thread : " + t4.age);
	}
}
