package com.bs.exceptions;

public class Case1 {
	public static void main(String[] args) {
		try {
			System.out.println("try block");
			int a = 10 / 0;
		} catch (NullPointerException e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("after try/catch/finally block");
	}

}

