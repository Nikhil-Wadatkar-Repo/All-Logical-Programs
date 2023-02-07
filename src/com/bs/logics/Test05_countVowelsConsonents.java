package com.bs.logics;

public class Test05_countVowelsConsonents {
    public static void main(String[] args) {
        String str = "This is a really simple sentence";
        String uniqueString = getUniqueString (str);
        int conCount = 0, vcount = 0;
        char[] arr = uniqueString.toCharArray ();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'i' || arr[i] == 'e' || arr[i] == 'u' || arr[i] == 'o')
                conCount++;
            else
                vcount++;
        }

        System.out.println ("consonent: " + conCount + " Vowels:" + vcount);
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
