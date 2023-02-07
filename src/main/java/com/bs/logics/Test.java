package com.bs.logics;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> java = new ArrayList<>();
        java.add(12);
        java.add(13);
        java.add(15);
        java.add(10);

//        for (Integer num : java) {
//            java.add(25);
//        }

        java.forEach(num -> {
            java.add(3);
        });
    }
}