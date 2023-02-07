package com.bs.logics;

public class Test07_Panagram {
    public static void main(String[] args) {
        String str1 = "kgayak";

        boolean flag = true;

        for (int i = 0; i < str1.length () / 2; i++) {
            if (str1.charAt (i) != str1.charAt (str1.length () - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println ("panagram");
        else
            System.out.println ("Not panagram");

    }
}
