package com.programs.arrays;

import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = "123456";
		char[] arr=s.toCharArray();
		int n = arr.length;
		char temp=arr[0];
		for (int i = 0; i < n-1; i++) {
			arr[i]=arr[i+1];
		}
		//asignng first element to last element
		arr[n-1]=temp;
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
