package com.linkedlist.stackandqueue.queueimplementation;

import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> inputStack = new Stack<>();
    Stack<Integer> outputStack = new Stack<>();

    public void enqueue(int x) {
        inputStack.push(x);
        System.out.println(x + " enqueued");
    }

    public int dequeue() {
        if (inputStack.isEmpty() && outputStack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.pop();
    }

    public int peek() {
        if (inputStack.isEmpty() && outputStack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.peek();
    }

    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}

