package com.bs;

public class Test4 {
	public static void main(String[] args) {
		int initialNum = 39, finalNum = 39, mul = 1;

		for (int temp = initialNum; mul > 10; temp = mul, mul = 1) {
			int lastDif = temp % 10;
			mul = mul * lastDif;
			temp = temp / 10;

		}

		System.out.println(mul);
	}
}
