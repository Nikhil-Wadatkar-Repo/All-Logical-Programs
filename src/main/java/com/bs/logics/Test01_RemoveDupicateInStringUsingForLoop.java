package com.bs.logics;

public class Test01_RemoveDupicateInStringUsingForLoop {
    public static void main(String[] args) {
        String str = "madam";
        char[] arr = str.toCharArray ();
        int n = str.length ();

        int index = 0;

        for (int i = 0; i < n; i++) {
            int k=0;
            for (k = 0; k < i; k++) {
                if (arr[i] == arr[k]) break;
            }
            if (i == k) {
                arr[index++] = arr[i];
            }
        }
        String newStr = new String (arr);
//        System.out.println(String.valueOf(Arrays.copyOf(arr, index)));

        for (int i = 0; i < index; i++) {
            System.out.print (arr[i]+" ");
        }
    }
}
