package com.bs;

public class TestDemo {
	public static void main(String[] args) {
		String str = "123 456 789";
		String rev = "";
		char[] strArr = str.toCharArray();

		for (int i = 0; i < strArr.length; i++) {
			int k = i;
			while (i < strArr.length && strArr[i] != ' ') {
				i++;
			}

			int j = i - 1;
			while (k <= j) {
				rev = rev + strArr[j];
				j--;
			}
			rev = rev + " ";

		}
		System.out.println(rev);
	}

}
