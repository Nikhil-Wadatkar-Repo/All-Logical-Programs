package com.programs.arrays;

public class FibonacciSeriesCode {

	public static void main(String[] args) {

		int a = 0, b = 1, c;
		int count = 5;
		int sum = 0;
		for (int index = 0; index < count; index++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
//		logic for adding only even indexs
			if (index % 2 == 0)
				sum = sum + c;
		}

		System.out.println("Sum: " + sum);
	}
}
