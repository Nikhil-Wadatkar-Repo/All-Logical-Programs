package com.bs.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTwoListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(13);
        list2.add(22);
        list2.add(3);
        list2.add(5);

        System.out.println("========================");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("========================");
        boolean b = list1.retainAll(list2);
        System.out.println(b);


        // java 8
        List<Integer> collect = list1.stream().filter(num1 -> list2.contains(num1)).collect(Collectors.toList());
        System.out.println(collect);
        long commonElementCount = list1.stream().filter(num1 -> list2.contains(num1)).count();
        System.out.println("Count: "+commonElementCount);

    }
}
