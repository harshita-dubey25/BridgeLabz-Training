package com.linkedlist.taskscheduler;

public class TaskScheduler {
	private TaskNode head = null;
    private TaskNode tail = null;
    private TaskNode currentTask = null;
    
    public void addTask(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; 
            currentTask = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; 
        }
    }

    public void removeTask(int id) {
        if (head == null) return;

        TaskNode curr = head;
        TaskNode prev = tail;

        do {
            if (curr.taskId == id) {
                if (curr == head && curr == tail) { // Only one node
                    head = tail = currentTask = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head) head = head.next;
                    if (curr == tail) tail = prev;
                }
                System.out.println("Task " + id + " removed.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void nextTask() {
        if (currentTask != null) {
            System.out.println("Current Task: " + currentTask.taskName);
            currentTask = currentTask.next;
            System.out.println("Next up: " + currentTask.taskName);
        }
    }

    public void displayTasks() {
        if (head == null) return;
        TaskNode temp = head;
        System.out.println("\n--- Task List (Circular) ---");
        do {
            System.out.print("[" + temp.taskId + ": " + temp.taskName + "] -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head)");
    }
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Found: [ID: " + temp.taskId + "] " + temp.taskName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No tasks found with priority " + priority);
    }
}