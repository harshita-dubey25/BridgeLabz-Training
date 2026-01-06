package com.hashmap;

import java.util.HashSet;

public class PairSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> visited = new HashSet<>();

        for (int num : arr) {
            int required = target - num;
            if (visited.contains(required)) {
                System.out.println("Pair found: " + num + " + " + required + " = " + target);
                return true;
            }

            visited.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1,9};
        int target = 10;

        if (!hasPairWithSum(arr, target)) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
