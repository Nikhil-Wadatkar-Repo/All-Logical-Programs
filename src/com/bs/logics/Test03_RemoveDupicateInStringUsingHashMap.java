package com.bs.logics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Test03_RemoveDupicateInStringUsingHashMap {

    public static void main(String[] args) {
        String str = "madam";
        char[] arr = str.toCharArray ();
        int n = str.length ();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add (arr[i]);
        }

        System.out.println (set);
    }
}
