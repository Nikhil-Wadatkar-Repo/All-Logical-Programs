package com.bs.roughWork.exceptions;

public class Case6 {
    public static void main(String[] args) {

        System.out.println(test());
    }

    private static int test() {
        try {
            System.out.println("try block");
            System.out.println(10 / 0);

        } catch (NullPointerException pointerException) {
            System.out.println("catch block");
            return  25;
        } finally {
            System.out.println("finally block");
            return 66;
        }


    }
}
