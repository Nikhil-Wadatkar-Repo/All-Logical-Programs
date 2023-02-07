package com.bs.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTwoListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(32);
        list1.add(42);
        list1.add(52);
        list1.add(62);
        list1.add(72);
        list1.add(82);
        list1.add(92);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(33);
        list2.add(22);
        list2.add(32);
        list2.add(42);
        list2.add(42);
        list2.add(35);
        list2.add(72);
        list2.add(31);
        list2.add(92);

        System.out.println("========================");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("========================");
//        List<Integer> similarElements = list1.stream().filter(listElements1 ->
//                list2.stream().filter(listElements2 -> listElements2 == listElements1).count() > 1).collect(Collectors.toList());
//        System.out.println(similarElements);


        List<Integer> collect = list1.stream().filter(num1 -> list2.contains(num1)).collect(Collectors.toList());
        System.out.println(collect);


    }
}
