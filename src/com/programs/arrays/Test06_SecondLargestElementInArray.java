package com.programs.arrays;

public class Test06_SecondLargestElementInArray {
	public static void main(String args[]) {
		// Initialize array
		int[] a = new int[] { 1, 100,25, 65, 98, 52, 57 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		// sorted array
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.println("2nd larget element : "+a[a.length-2]);
		System.out.println("3rd larget element : "+a[a.length-3]); // line no. 1
	}
}