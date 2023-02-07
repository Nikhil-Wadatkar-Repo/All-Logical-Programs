package com.bs;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 7, 8, 3 };
		int i = 0, leftSum = 0, rightSum = 0, finalIndex = 0;

		for (i = 1; i < arr.length - 1; i++) {
			leftSum = 0;
			rightSum = 0;
			// for loop for calculating left sum
			for (int j = 0; j < arr.length; j++) {
				if (j < i) {
					leftSum = leftSum + arr[j];
				}
				if (j == i)
					continue;
				if (j > i && j < arr.length - 1) {
					rightSum = rightSum + arr[j];
				}

				System.out.println("i: "+i+"Leftsum: " + leftSum + "  sum:" + rightSum);
				if (leftSum == rightSum) {
					System.out.println("Index: " + i);
					finalIndex = i;
					break;
				}
			}
		}
		System.out.println("Final index: " + finalIndex);
	}
}
