package com.programs.arrays;

public class Test03_NoOfOccCharsUsingIndex {
	public static void main(String a[]) {
		char[] arr = "malayalama".toUpperCase().toCharArray();
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					for (int k = j; k < n - 1; k++) {
						arr[k] = arr[k + 1];
					}
					n--;
					j--;
				}
			}
			System.out.print(arr[i] + "=" + count + ", ");
		}
	}


}
