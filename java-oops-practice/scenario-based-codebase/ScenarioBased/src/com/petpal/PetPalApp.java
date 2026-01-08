package com.petpal;

import java.util.Scanner;

public class PetPalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pet pet = null;
        
        String type;

        System.out.println("🐾 Welcome to PetPal – Virtual Pet Care App 🐾");
        System.out.println("Choose a pet to adopt:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        // Pet selection using switch
        switch (choice) {
            case 1:
            	type = "Dog";
                pet = new Dog(name,type,age);
                break;
            case 2:
            	type = "Cat";
                pet = new Cat(name,type, age);
                break;
            case 3:
            	type = "Bird";
                pet = new Bird(name,type, age);
                break;
            default:
                System.out.println("Invalid choice! Exiting...");
                return;
        }

        int action;
        do {
            System.out.println("\n🔹 What would you like to do?");
            System.out.println("1. Feed Pet");
            System.out.println("2. Play with Pet");
            System.out.println("3. Let Pet Sleep");
            System.out.println("4. Make Sound");
            System.out.println("5. Show Pet Status");
            System.out.println("6. Exit");

            action = sc.nextInt();

            switch (action) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    pet.makeSound();
                    break;
                case 5:
                    pet.displayStatus();
                    break;
                case 6:
                    System.out.println("Thank you for using PetPal 🐶🐱🐦");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }

        } while (action != 6);

        sc.close();
    }
}
