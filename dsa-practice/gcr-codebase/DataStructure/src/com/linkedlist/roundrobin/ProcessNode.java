package com.linkedlist.roundrobin;

public class ProcessNode {
	public int pid;
    public int burstTime;
    public int remainingTime;
    public int priority;
    public int arrivalTime;
    public int finishTime;
    public int waitingTime;
    public int turnAroundTime;
    
    public ProcessNode next;

    public ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}