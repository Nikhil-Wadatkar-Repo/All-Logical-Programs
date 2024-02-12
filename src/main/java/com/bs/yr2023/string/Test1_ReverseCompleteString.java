package com.bs.yr2023.string;

public class Test1_ReverseCompleteString {
    public static void main(String[] args) {
        String str="12345";
        char[] arr=str.toCharArray();
        String rev;
//        1. reversing from end
//        for(int i=str.length()-1;i>=0;i--){
//            rev=rev+str.charAt(i);
//        }

//        2. swapping
//        for (int i = 0,j=arr.length-1; i < arr.length/2; i++,j--) {
//            char temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//        rev=arr.toString();
        StringBuilder sb=new StringBuilder(str);
        rev=sb.reverse().toString();
        System.out.println(rev);
    }
}
