package com.bs.interview;

public class Test06_SwapByTwoIndex {

	public static void main(String[] args) {
		String input="Nikhil W";
		char[] arr=input.toCharArray();
	

		for(int i=0;i<arr.length-2;i+=2){
			char temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
		String output=new String(arr);
		System.out.println(input);
		System.out.println(output);

	}

}
