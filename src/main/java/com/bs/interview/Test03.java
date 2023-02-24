package com.bs.interview;

public class Test03 {

	public static void main(String[] args) {

		int number = 153;
		
		int armstronValue = 0,noOfDigit=String.valueOf(153).length();
		for (int temp = number; temp > 0;) {
			int lD = temp % 10;
			noOfDigit = noOfDigit+1;
			temp = temp / 10;
		}
		for (int temp = number; temp > 0;) {
			int lD = temp % 10;
			armstronValue = armstronValue+((int)Math.pow(lD, noOfDigit));
			temp = temp / 10;
		}
		
		noOfDigit=0;
		int temp1=number;
		while(temp1>0) {
			noOfDigit=noOfDigit+1;
			temp1=temp1/10;
			
		}
		System.out.println("===>"+noOfDigit);

		if (armstronValue == number)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
