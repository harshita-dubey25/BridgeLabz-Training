package com.string;

import java.util.HashSet;

public class RemoveDuplicates{

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!seen.contains(ch)) {
                result.append(ch);   
                seen.add(ch);        
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("String without duplicates: " + output);
    }
}
