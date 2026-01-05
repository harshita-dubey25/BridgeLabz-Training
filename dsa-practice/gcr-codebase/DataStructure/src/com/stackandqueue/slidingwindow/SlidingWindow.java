package com.stackandqueue.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {

    public static void findMaxInWindows(int[] arr, int k) {
        if (arr == null || k <= 0) return;

        int n = arr.length;
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()] + " ");
            }
        }
    }

}

