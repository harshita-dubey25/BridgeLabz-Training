package com.linkedlist.taskscheduler;

import java.util.*;

public class TaskSchedulerApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();
        boolean running = true;

        System.out.println("---------------Circular Task Scheduler---------------");

        while (running) {
            System.out.println("\n1. Add Task\n2. View/Next Task\n3. Remove Task\n4. Display All\n5. Search by Priority\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Priority (1-5): ");
                    int priority = sc.nextInt();
                    System.out.print("Enter Due Date (DD/MM): ");
                    String date = sc.next();
                    
                    scheduler.addTask(id, name, priority, date);
                    System.out.println("Task added successfully.");
                }
                case 2 -> scheduler.nextTask();
                case 3 -> {
                    System.out.print("Enter Task ID to remove: ");
                    int removeId = sc.nextInt();
                    scheduler.removeTask(removeId);
                }
                case 4 -> scheduler.displayTasks();
                case 5 -> {
                    System.out.print("Enter Priority to search: ");
                    int pSearch = sc.nextInt();
                    scheduler.searchByPriority(pSearch);
                }
                case 6 -> {
                    running = false;
                    System.out.println("Exiting Scheduler!");
                }
                default -> System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}