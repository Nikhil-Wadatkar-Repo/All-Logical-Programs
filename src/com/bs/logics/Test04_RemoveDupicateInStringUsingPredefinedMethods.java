package com.bs.logics;

public class Test04_RemoveDupicateInStringUsingPredefinedMethods {
    public static void main(String[] args) {
        //Create an empty string
        String newstr = "";

        String str = "malayalama";
        int length = str.length ();

        // Traverse the string and check for the repeated characters
        for (int i = 0; i < length; i++) {
            // store the character available at ith index in the string
            char charAtPosition = str.charAt (i);

            // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string
            if (newstr.indexOf (charAtPosition) < 0) {
                newstr += charAtPosition;
            }
        }
        //Print string after removing duplicate characters
        System.out.println (newstr);
    }
}
