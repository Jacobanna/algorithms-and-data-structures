package com.jp.algorithms.other;

public class ReverseString {
    public static String reverse(String string) {
        if(string == null) {
            return null;
        }
        char[] charArray = string.toCharArray();
        String reversedString = "";
        for (int i = charArray.length-1; i>=0; i--) {
            reversedString += charArray[i];
        }
        return reversedString;
    }
}
