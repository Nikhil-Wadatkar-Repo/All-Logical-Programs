package com.bs.yr2024.string;

public class Test6_RemoveDuplicateCharsUsingIndexOfMethod {
	public static void main(String[] args) {
		String str = "malyalam";
		char[] arr = str.toCharArray();
		String set = "";

		for (int i = 0; i < arr.length; i++) {
			char ch = str.charAt(i);

			if (set.indexOf(ch) < 0)
				set = set + ch;
		}
		System.out.println(set);
	}
}
