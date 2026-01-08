package com.string;

public class StringConcatenation {

    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " Welcome", " to Java."};

        String result = concatenateStrings(words);

        System.out.println("Concatenated String: " + result);
    }
}
