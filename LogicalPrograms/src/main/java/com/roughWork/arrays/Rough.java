package com.roughWork.arrays;

public class Rough {
    public static void main(String[] args) {
        //Initialize matrix a
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int b[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //Calculates the number of rows and columns present in the given matrix
        int rows = a.length;
        int cols = a[0].length;
        boolean flag = false;

        //if each eement of a matrix is exactly equal to b matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (a[row][col] == b[row][col]) {
                    flag = true;
                }
            }
        }
    if(flag)
        System.out.println ("all are same");
    else
        System.out.println ("not same");

    }
}
