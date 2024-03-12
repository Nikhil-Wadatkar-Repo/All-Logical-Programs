package com.bs.multithreading.interThreadCommunication;

class PostOffice {
	static public String message = "Not Received";

	public String getNotification() {
		return "Num:  ";
	}
}

class PostMaster extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setName("Post Master Thread");

		synchronized (this) {
			PostOffice.message = "Received";
			this.notify();
		}

	}
}

public class PostOfficeExample {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Before message = " + PostOffice.message);
		Thread.currentThread().setName("Customer Thread");
		PostMaster postMasterThread = new PostMaster();
		postMasterThread.start();
		synchronized (postMasterThread) {
			postMasterThread.wait();
		}

		System.out.println("After message = " + PostOffice.message);
	}

}
