package com.bs.roughWork.exceptions;

public class Case2 {
    public static void main(String[] args) {

        try {
            System.out.println("try block");
            int a =10/0;
        } catch (Exception e) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("after try/catch/finally block");
    }
}
