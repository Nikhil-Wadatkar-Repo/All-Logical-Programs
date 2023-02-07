package com.roughWork.rough;

public class Test01_ReverseString{

	public static void main(String[] args) {
		String str = "ankur";
//        reverseStringBySwapingElement (str);
        reverseStringFromLastIndex(str);

	}

	private static void reverseStringFromLastIndex(String str) {
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void reverseStringBySwapingElement(String str) {
		char[] arr = str.toCharArray();
		int length = arr.length;

		for (int i = 0; i < length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
