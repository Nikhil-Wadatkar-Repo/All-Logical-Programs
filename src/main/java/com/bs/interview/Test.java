package com.bs.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new LinkedHashMap<>();
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");
        map1.put(4, "Four");
        map1.put(5, "Five");

        map2.put(1, "One");
        map2.put(3, "Two");
        map2.put(5, "Three");
        map2.put(2, "Four");
        map2.put(4, "Five");

        map1.forEach((m1Value, m1Name) -> {
            map2.forEach((m2Value, m2Name) -> {

                String name = m1Name;
                if (m1Value == m2Value && m2Name.equalsIgnoreCase(m1Name)) {
                    System.out.println("Match found with " + m1Name + " " + m1Value);
                } else {
                    for (Map.Entry<Integer, String> m : map2.entrySet()) {
                        if (name.equalsIgnoreCase(m.getValue())) {
                            System.out.println(name + " is present at " + m.getKey() + "index");
                            break;
                        }
                    }
                }
            }
            );
        });

    }
}

//map1 => int,string 0, one  
//map2 => int,string 4, one
// map2.forEach((m3Value,m3Name)->{
//                        if(name.equalsIgnoreCase(m3Name)){
//                            System.out.println(name+" is present at "+m3Value+"index");
//                        }
//                    }










