package com.programs.arrays;

public class Test06_LargestElementInArray {
	public static void main(String args[]) {
		// Initialize array
		int[] a = new int[] { 25,12,10,02,2,5,65,98 };
		
		//way 1
		int max = a[0];
		// Searches for duplicate element
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("Max: " + max);
		
		//way 2
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Lagest elemnt :"+a[a.length-1]);
	}
}