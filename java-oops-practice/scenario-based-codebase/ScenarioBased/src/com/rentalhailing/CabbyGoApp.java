package com.rentalhailing;
import java.util.*;

public class CabbyGoApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IRideService rideService = new RideBookingSystem();
        boolean running = true;

        System.out.println("--- Welcome to CabbyGo Management System ---");

        while (running) {
            System.out.println("\n--- New Ride Request ---");
            
            System.out.print("Enter passenger name (or type 'exit' to quit): ");
            String passengerName = sc.next(); 
            
            if (passengerName.equalsIgnoreCase("exit")) {
                running = false;
                break;
            }

            System.out.println("Available Vehicles: 1. Mini | 2. Sedan | 3. SUV");
            System.out.print("Select vehicle type (1-3): ");
            int choice = sc.nextInt();

            Vehicle selectedVehicle = null;
            switch (choice) {
                case 1 -> selectedVehicle = new Mini("CAB-MINI-01");
                case 2 -> selectedVehicle = new Sedan("SEDAN-01");
                case 3 -> selectedVehicle = new SUV("SUV-01");
                default -> {
                    System.out.println("Invalid choice. Selecting Mini by default.");
                    selectedVehicle = new Mini("MINI-01");
                }
            }

            System.out.print("Enter distance (km): ");
            double distance = sc.nextDouble();

            // Book and calculate fare
            rideService.bookRide(passengerName, selectedVehicle, distance);
            
            System.out.print("Type 'END' to complete payment: ");
            String endSignal = sc.next();
            
            if (endSignal.equalsIgnoreCase("END")) {
                rideService.endRide();
            }

            System.out.print("\nWould you like to book another ride? (yes/no): ");
            String continueChoice = sc.next();
            if (continueChoice.equalsIgnoreCase("no")) {
                running = false;
            }
        }

        System.out.println("Thank you for using CabbyGo. System shutting down...");
        sc.close();
    }
}

