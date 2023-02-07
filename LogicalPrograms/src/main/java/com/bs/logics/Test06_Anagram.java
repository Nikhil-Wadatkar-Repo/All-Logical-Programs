package com.bs.logics;

public class Test06_Anagram {
    public static void main(String[] args) {
        String str1 = "Braakag";
        String str2 = "Grrrab";

        boolean flag = false;
        String sortedString1 = sortString (getUniqueString (str1));
        String sortedString2 = sortString (getUniqueString (str2));

        for (int i = 0; i < sortedString2.length (); i++) {
            if (sortedString1.charAt (i) == sortedString2.charAt (i))
                flag = true;
        }
        if (flag)
            System.out.println ("anagram");
        else
            System.out.println ("Not anagram");

    }

    private static String sortString(String str1) {
        char[] arr = str1.toCharArray ();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char ch = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = ch;
            }
        }

        return new String (arr);
    }

    private static String getUniqueString(String str) {
        int index = 0, j = 0;
        char[] arr = str.toCharArray ();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                arr[index++] = arr[i];
            }
        }
        String newString = "".concat (new String (arr));
        return newString.substring (0, index);
    }
}
