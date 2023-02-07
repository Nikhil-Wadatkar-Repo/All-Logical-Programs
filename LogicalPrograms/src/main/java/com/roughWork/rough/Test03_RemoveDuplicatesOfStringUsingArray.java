package com.roughWork.rough;

public class Test03_RemoveDuplicatesOfStringUsingArray {

	public static void main(String[] args) {

		String str = "madam";
		char[] arr = str.toCharArray();
		int n = str.length();

		int index = 0;

		for (int i = 0; i < n; i++) {
			System.out.print(i+" : ");
			int k = 0;
			for (k = 0; k < i; k++) {
				System.out.print(k+" ");
				
				if (arr[i] == arr[k])
					break;		
			}	if (i == k) {
				arr[index++] = arr[i];
			}
			System.out.println();
		}
		String newStr = new String(arr);

		for (int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
