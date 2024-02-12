package com.bs.yr2023.string;

public class Test2_ReverseWordsOfString {
    public static void main(String[] args) {
        String str = "123 456 789";
        String rev = "";
        
//      1. based on index
//        char[] strArr = str.toCharArray();
//        for (int i = 0; i < strArr.length; i++) {
//            int k = i;
//            while (i < strArr.length && strArr[i] != ' ') {
//                i++;
//            }
//
//            int j = i - 1;
//            while (k <= j) {
//                rev = rev + strArr[j];
//                j--;
//            }
//            rev = rev + " ";
//        }

        
//        2. based on rverse and split method
        String[] strArr=str.split(" ");
        
        
        for (int i = 0; i < strArr.length; i++) {
        	StringBuilder sb=new StringBuilder(strArr[i]);
        	rev=rev+sb.reverse().toString()+" ";
		}
        System.out.println(rev);
    }
}
