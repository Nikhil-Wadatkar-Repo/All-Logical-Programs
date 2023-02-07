package com.programs.arrays;

public class Test01_StringReverse {

	public static void main(String a[]) {
		String str = "ab2cde2fghi2kjlmn2op";
		String arr[] = str.split("2");
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			char[] charArr = arr[i].toCharArray();
			for (int k = charArr.length - 1; k >= 0; k--) {
				System.out.print(charArr[k]);
			}
			System.out.print(" ");
		}

	}
}