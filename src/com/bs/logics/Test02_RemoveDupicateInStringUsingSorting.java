package com.bs.logics;

import java.util.Arrays;

public class Test02_RemoveDupicateInStringUsingSorting {
    public static void main(String[] args) {
        String str = "malayalama";
        char[] arr = str.toCharArray ();
        Arrays.sort(arr);
        
        int index1=1,index2=1;
        int length=arr.length;
        
        while(index1!=length) {
        	if(arr[index1]!=arr[index1-1]) {
        		arr[index2]=arr[index1];
        		index2++;
        	}
        	index1++;
        }
        
        for (int i = 0; i < index2; i++) {
			System.out.print(arr[i]+" ");
		}

    }
}
