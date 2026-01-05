package com.stackandqueue.slidingwindow;

public class Main {
	public static void main(String[] args) {
		SlidingWindow s = new SlidingWindow(); 
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        s.findMaxInWindows(arr, k);
    }
}
