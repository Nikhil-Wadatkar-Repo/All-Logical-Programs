package com.bs.roughWork.arrays;

public class MissingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length;
        int sum1 = (n + 1) * (n + 2) / 2, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += arr[i];
        }
        System.out.println("Missing array is " + (sum1 - sum2));
    }


}
