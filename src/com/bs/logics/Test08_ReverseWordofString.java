package com.bs.logics;

import java.util.Scanner;

public class Test08_ReverseWordofString {
    public static void main(String[] args) {
        String st = "Enter the sentence";
        char ch[] = st.toCharArray ();
        String rst = " ";
        for (int i = 0; i < ch.length; i++) {
            int k = i;
            while (i < ch.length && ch[i] != ' ') {
                i++;
            }
            int j = i - 1;
            while (k <= j) {
                rst = rst + ch[j];
                j--;
            }
            rst = rst + ' ';
        }
        System.out.println ("The reserved word of sentence is:" + rst);
    }
}