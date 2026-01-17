package com;

import java.util.LinkedList;
import java.util.Scanner;


public class ParcelTracker {

	
    static LinkedList<String> stages = new LinkedList<>();

    
    public static void addStage(String stage) {
        stages.add(stage);
    }

    
    public static void addAfter(String existingStage, String newStage) {
        int index = stages.indexOf(existingStage);

        if (index == -1) {
            System.out.println("Stage not found!");
            return;
        }

        stages.add(index + 1, newStage);
    }

    
    public static void displayStages() {
        if (stages.isEmpty()) {
            System.out.println("No parcel stages available.");
            return;
        }

        for (int i = 0; i < stages.size(); i++) {
            System.out.print(stages.get(i));
            if (i < stages.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    
    public static void checkParcelStatus() {
        if (stages.isEmpty()) {
            System.out.println("Parcel is lost! No tracking data.");
            return;
        }

        String lastStage = stages.getLast();

        if (!lastStage.equalsIgnoreCase("Delivered")) {
            System.out.println("Parcel missing after stage: " + lastStage);
        } else {
            System.out.println("Parcel delivered successfully.");
        }
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        
        do {
            System.out.println("\n--- Parcel Tracker Menu ---");
            System.out.println("1. Add Delivery Stage");
            System.out.println("2. Add Intermediate Checkpoint");
            System.out.println("3. Display Parcel Stages");
            System.out.println("4. Check Lost/Missing Parcel");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter stage name: ");
                    addStage(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter existing stage: ");
                    String existing = sc.nextLine();
                    System.out.print("Enter new checkpoint: ");
                    String newStage = sc.nextLine();
                    addAfter(existing, newStage);
                    break;

                case 3:
                    displayStages();
                    break;

                case 4:
                    checkParcelStatus();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}