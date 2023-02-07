package com.programs.string;

import java.util.Arrays;

public class Test01_RemoveDuplicateCharsFromString {

	public static void main(String[] args) {
		String str = "malayalama";
		char[] arr = str.toLowerCase().toCharArray();
		int length = str.length();
		int index = 0, k = 0;

		// first pointer
		for (int i = 0; i < length; i++) {

			// check if same content there for its previous element
			// if content = same break it and check if index same then add
			for (k = 0; k < i; k++) {
				if (arr[i] == arr[k])
					break;
			}
			if (i == k)
				arr[index++] = arr[i];

		}
		System.out.println(String.valueOf(Arrays.copyOf(arr, index)));
	}

}
