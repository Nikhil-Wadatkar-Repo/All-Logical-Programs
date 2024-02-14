package com.bs.yr2024.string;

import java.util.Arrays;

public class Test4_RemoveDuplicateCharsUsingSorting {
	public static void main(String[] args) {
		String str = "malyalam";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);

		int i1 = 1, i2 = 1;
		while (i1 != str.length()) {
			if (arr[i1] != arr[i1 - 1]) {
				arr[i2] = arr[i1];
				i2++;
			}
			i1++;
		}

		for (int i = 0; i < i2; i++) {
			System.out.print(arr[i]);
		}
	}
}
