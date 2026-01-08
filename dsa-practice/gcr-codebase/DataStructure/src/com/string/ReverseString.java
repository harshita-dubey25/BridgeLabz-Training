package com.string;

public class ReverseString {

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = reverseString(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + output);
    }
}
