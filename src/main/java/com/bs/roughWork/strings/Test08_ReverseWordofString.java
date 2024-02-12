package com.bs.roughWork.strings;

public class Test08_ReverseWordofString {
	public static void main(String[] args) {
		String st = "Enter the sentence";
		char ch[] = st.toCharArray();
		String rst = " ";
		
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			int j = i - 1;
			while (k <= j) {
				rst = rst + ch[j];
				j--;
			}
			rst = rst + ' ';
		}
		System.out.println(rst);
		System.out.println(st.length() + " " + rst.length());
	}
}