package com.bs.roughWork.rough;

public class Test02_ReverseWordsOfString {

	public static void main(String[] args) {
		String str = "My Name is Ankur Wadatkar";
		char[] arr = str.toCharArray();
		String reversedString=" ";
		int k=0;
		for (int i = 0; i<arr.length; i++) {
			
			k=i;
			while(i<arr.length&&arr[i]!=' ')
				i++;
			
			int j=i-1;
			while(k<=j) {
				reversedString=reversedString+arr[j];
				j--;
			}
			reversedString=reversedString+' ';
		}
		
		
		System.out.println(reversedString);
		
	}

}
