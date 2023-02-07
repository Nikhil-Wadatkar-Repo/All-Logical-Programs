package com.programs.arrays;

public class Test04_ShiftArrayElementLeftByN {
	public static void main(String a[]) {
		char[] arr = "123456".toCharArray();
		int n = 2;
		
		char first=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		
		
	}

}
