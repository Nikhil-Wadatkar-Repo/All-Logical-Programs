package com.bs.yr2024.string;

import java.util.Iterator;

public class Test3_RemoveDuplicateCharsUsingForLoop {

	public static void main(String[] args) {
		String str = "madam";
		char[] arr = str.toCharArray();
		int index = 0;

		for (int i = 0; i < str.length(); i++) {
			int k = 0;
			// iterate from 0 index upto i
			for (k = 0; k < i; k++) {

				// if same content , break
				if (arr[i] == arr[k])
					break;

			}
			// if index are same them exchange array element
			if (k == i) {
				arr[index++] = arr[i];
			}
		}

		String newStr = new String(arr);
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i]);
		}
	}

}
