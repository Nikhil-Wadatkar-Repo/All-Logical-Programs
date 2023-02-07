package com.bs.roughWork.strings;

public class Test09_WordReverseUsingStringArray {
	public static void main(String[] args) {
		String string = "123 456 789";
		String[] str = string.split(" ");
		int j = 0, k = 0;
		String rs = "";

		for (int i = 0; i < str.length; i++) {
			char[] arr = str[i].toCharArray();
			j = arr.length - 1;
			while (j >= 0) {
				rs = rs + arr[j];
				j--;
			}
			// add white space at end of above while loop
			// to maintain white space. but extra white spac should
			// not get added at last string
			if (rs.length() < string.length())
				rs = rs + ' ';

		}
		System.out.println(rs);
		System.out.println(rs.length() + " " + string.length());
	}
}