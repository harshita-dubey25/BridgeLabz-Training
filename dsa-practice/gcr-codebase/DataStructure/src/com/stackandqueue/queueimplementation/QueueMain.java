package com.linkedlist.stackandqueue.queueimplementation;

public class QueueMain {
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
    }
}
