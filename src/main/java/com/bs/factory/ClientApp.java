package com.bs.factory;

public class ClientApp {
	public static void main(String[] args) {
		System.out.println(DetailsFactory.getInstance("Anku").getMyName("Ankurr"));
	}
}
