package com.roughWork.arrays;

import java.util.Scanner;

public class ArrayLeftShift {

    public static void main(String[] args) {
        int noOfElements = 3;
        int[] arr = {12, 15, 45, 98, 65, 98, 65, 6};
        int n = arr.length;
        showArray (arr, "Old Array: ", n);
        for (int j = 0; j < noOfElements; j++) {
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            //asignng first element to last element
            arr[n - 1] = temp;
        }

        System.out.println ();
        showArray (arr, "New Array: ", n);

    }

    private static void showArray(int[] arr, String message, int length) {
        System.out.println (message);
        for (int i = 0; i < length; i++) {
            System.out.print (arr[i] + " ");
        }
    }
}
