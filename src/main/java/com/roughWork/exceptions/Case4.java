package com.roughWork.exceptions;

public class Case4 {
    public static void main(String[] args) {

        try {
            System.out.println("try block");

        } finally {
            System.out.println("finally block");
        }
        System.out.println("after try/catch/finally block");
    }
}
