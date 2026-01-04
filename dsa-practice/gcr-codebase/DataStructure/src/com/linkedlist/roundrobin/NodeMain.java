package com.linkedlist.roundrobin;
import java.util.*;

public class NodeMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        System.out.print("Enter Time Quantum: ");
        int quantum = sc.nextInt();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Process " + (i + 1));
            System.out.print("Burst Time: ");
            int bt = sc.nextInt();
            System.out.print("Priority: ");
            int pr = sc.nextInt();
            scheduler.addProcess(i + 1, bt, pr);
        }

        scheduler.simulate(quantum);
        sc.close();
    }
}