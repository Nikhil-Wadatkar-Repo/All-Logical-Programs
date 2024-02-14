package com.bs;

import java.io.Serializable;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println(test());
	}

	private static String test() {
		try {
			return "try block return";
		} catch (Exception e) {
			return "catch block return";
		} finally {
			return "finally block";
		}
	}
}