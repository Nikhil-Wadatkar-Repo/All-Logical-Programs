package com.bs.roughWork.exceptions;

public class Case5 {
    public static void main(String[] args) {

        try {
            System.out.println("try block");
            System.out.println(10/0);

        } finally {
            System.out.println("finally block");
        }
        System.out.println("after try/catch/finally block");
    }
}
