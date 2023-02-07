package com.programs.string;

public class Test01_VowelsAndConsonents {

	public static void main(String[] args) {
		String str = "AnkurWadatkar";
		String str1 = getUniqueString(str.toLowerCase());
		int conCount = 0, vCount = 0;
		char[] arr = str1.toLowerCase().toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
				vCount++;
			else if (arr[i] >= 'a' && arr[i] <= 'z')
				conCount++;
		}
		System.out.println("vowels are " + vCount + "  consonents are " + conCount);
	}

	private static String getUniqueString(String str) {
		int lenght = str.length();
		char[] arr=str.toCharArray();
		int index = 0, k = 0;
		for (int i = 0; i < lenght; i++) {
			for (k = 0; k < i; k++) {
				if(arr[i]==arr[k])
					break;
			}
		}

		return new String(arr);
	}

}
