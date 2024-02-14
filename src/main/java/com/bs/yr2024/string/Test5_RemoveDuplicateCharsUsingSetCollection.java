package com.bs.yr2024.string;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test5_RemoveDuplicateCharsUsingSetCollection {
	public static void main(String[] args) {
		String str = "malyalam";
		char[] arr = str.toCharArray();
		Set<Character> set = new LinkedHashSet();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}
}
