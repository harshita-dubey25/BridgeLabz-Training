package com.stackandqueue.sortstack;

import java.util.Stack;

public class SortMain {
	public static void main(String[] args) {
		Sort s = new Sort();
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        s.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
