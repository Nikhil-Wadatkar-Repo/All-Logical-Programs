package com.programs.arrays;

public class Test10_SortArrayAscendingDescending {
	public static void main(String args[]) {
		// Initialize array
		int[] a = new int[] { 1, 100,25, 65, 98, 52, 57 };

		//ascending sort
		System.out.println("Ascnding sorting");
		sortAscendingly(a);
		showarray(a);
		//Desceding sorting
		System.out.println("\nDesceding sorting");
		sortDescendinglly(a);
		showarray(a);
	}

	private static void sortDescendinglly(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	private static void sortAscendingly(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	private static void showarray(int[] a) {
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i]+" ");
	}
}