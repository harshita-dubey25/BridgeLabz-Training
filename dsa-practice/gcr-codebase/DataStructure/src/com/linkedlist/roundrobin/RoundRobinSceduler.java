package com.linkedlist.roundrobin;

public class RoundRobinSceduler {
    private ProcessNode head = null;
    private ProcessNode tail = null;
    private int size = 0;

    // Add process to the circular queue
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    public void simulate(int timeQuantum) {
        if (head == null) return;

        ProcessNode current = head;
        ProcessNode prev = tail;
        int currentTime = 0;
        int completedProcesses = 0;
        int totalProcesses = size;

        System.out.println("\n--- Starting Round Robin Simulation ---");

        while (completedProcesses < totalProcesses) {
            if (current.remainingTime > 0) {
                int executionTime = Math.min(current.remainingTime, timeQuantum);
                current.remainingTime -= executionTime;
                currentTime += executionTime;

                System.out.println("Time " + currentTime + ": Process " + current.pid + 
                                   " executed for " + executionTime + "ms. Remaining: " + current.remainingTime);

                // If process finishes
                if (current.remainingTime == 0) {
                    current.finishTime = currentTime;
                    current.turnAroundTime = current.finishTime; // Assuming arrival at 0
                    current.waitingTime = current.turnAroundTime - current.burstTime;
                    completedProcesses++;
                    System.out.println(">> Process " + current.pid + " COMPLETED.");
                }
            }
            
            prev = current;
            current = current.next;
            displayQueue();
        }
        calculateAverages(totalProcesses);
    }

    private void calculateAverages(int total) {
        double totalWT = 0, totalTAT = 0;
        ProcessNode temp = head;
        for (int i = 0; i < total; i++) {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnAroundTime;
            temp = temp.next;
        }
        System.out.println("\nAverage Waiting Time: " + (totalWT / total));
        System.out.println("Average Turnaround Time: " + (totalTAT / total));
    }

    public void displayQueue() {
        if (head == null) return;
        ProcessNode temp = head;
        System.out.print("Current Queue Status: ");
        do {
            if (temp.remainingTime > 0) {
                System.out.print("[P" + temp.pid + ": " + temp.remainingTime + "] -> ");
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Loop)");
    }
}