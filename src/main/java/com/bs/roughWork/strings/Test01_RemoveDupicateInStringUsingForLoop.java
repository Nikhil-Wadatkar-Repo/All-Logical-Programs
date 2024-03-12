package com.bs.roughWork.strings;

public class Test01_RemoveDupicateInStringUsingForLoop {
    public static void main(String[] args) {
        String str = "madam";
        char[] arr = str.toCharArray ();
        int n = str.length ();

        int index = 0;

        for (int mainPointer = 0; mainPointer < n; mainPointer++) {
            int rotator=0;
            for (rotator = 0; rotator < mainPointer; rotator++) {
                if (arr[mainPointer] == arr[rotator]) break;
            }
            if (mainPointer == rotator) {
                arr[index++] = arr[mainPointer];
            }
        }
        String newStr = new String (arr);
//        System.out.println(String.valueOf(Arrays.copyOf(arr, index)));

        System.out.println("New String");
        for (int i = 0; i < index; i++) {
            System.out.print (arr[i]+" ");
        }
    }
}
