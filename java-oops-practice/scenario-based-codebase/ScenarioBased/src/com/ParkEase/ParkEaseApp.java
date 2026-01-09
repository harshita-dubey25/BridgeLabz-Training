package ParkEase;

import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fixed parking slots
        ParkingSlot[] carSlots = {
                new ParkingSlot(1, "Ground Floor", "Car"),
                new ParkingSlot(2, "Ground Floor", "Car")
        };

        ParkingSlot[] bikeSlots = {
                new ParkingSlot(3, "Basement", "Bike"),
                new ParkingSlot(4, "Basement", "Bike")
        };

        ParkingSlot[] truckSlots = {
                new ParkingSlot(5, "Open Area", "Truck"),
                new ParkingSlot(6, "Open Area", "Truck")
        };

        while (true) {
            System.out.println("\n===== ParkEase Menu =====");
            System.out.println("1. Check Slot Availability");
            System.out.println("2. Park Vehicle");
            System.out.println("3. Release Slot");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    showAvailability(carSlots, bikeSlots, truckSlots);
                    break;

                case 2:
                    parkVehicle(sc, carSlots, bikeSlots, truckSlots);
                    break;

                case 3:
                    releaseSlot(sc, carSlots, bikeSlots, truckSlots);
                    break;

                case 4:
                    System.out.println("Thank you for using ParkEase!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ---------------- Helper Methods ----------------

    private static void showAvailability(ParkingSlot[] carSlots,
                                         ParkingSlot[] bikeSlots,
                                         ParkingSlot[] truckSlots) {

        System.out.println("\n--- Slot Availability ---");
        displaySlots("Car", carSlots);
        displaySlots("Bike", bikeSlots);
        displaySlots("Truck", truckSlots);
    }

    private static void displaySlots(String type, ParkingSlot[] slots) {
        System.out.print(type + " Slots: ");
        for (ParkingSlot slot : slots) {
            System.out.print(slot.isAvailable() ? "[Free] " : "[Occupied] ");
        }
        System.out.println();
    }

    private static void parkVehicle(Scanner sc,
                                    ParkingSlot[] carSlots,
                                    ParkingSlot[] bikeSlots,
                                    ParkingSlot[] truckSlots) {

        System.out.print("Enter Vehicle Type (Car/Bike/Truck): ");
        String type = sc.next();

        System.out.print("Enter Vehicle Number: ");
        String number = sc.next();

        System.out.print("Enter Parking Hours: ");
        int hours = sc.nextInt();

        Vehicle vehicle = null;
        ParkingSlot[] selectedSlots = null;

        switch (type.toLowerCase()) {
            case "car":
                vehicle = new Car(number);
                selectedSlots = carSlots;
                break;

            case "bike":
                vehicle = new Bike(number);
                selectedSlots = bikeSlots;
                break;

            case "truck":
                vehicle = new Truck(number);
                selectedSlots = truckSlots;
                break;

            default:
                System.out.println("Invalid vehicle type!");
                return;
        }

        for (ParkingSlot slot : selectedSlots) {
            if (slot.isAvailable()) {
                slot.assignSlot(vehicle);
                System.out.println("Vehicle parked successfully.");
                System.out.println("Charges: ₹" + vehicle.calculateCharges(hours));
                return;
            }
        }

        System.out.println("No available slots for " + type);
    }

    private static void releaseSlot(Scanner sc,
                                    ParkingSlot[] carSlots,
                                    ParkingSlot[] bikeSlots,
                                    ParkingSlot[] truckSlots) {

        System.out.print("Enter Slot ID to release: ");
        int id = sc.nextInt();

        ParkingSlot[] allSlots = {
                carSlots[0], carSlots[1],
                bikeSlots[0], bikeSlots[1],
                truckSlots[0], truckSlots[1]
        };

        for (ParkingSlot slot : allSlots) {
            if (slot.isAvailable() == false && slotIdMatches(slot, id)) {
                slot.releaseSlot();
                System.out.println("Slot released successfully.");
                slot.showLog();
                return;
            }
        }

        System.out.println("Invalid or already free slot.");
    }

    private static boolean slotIdMatches(ParkingSlot slot, int id) {
        try {
            java.lang.reflect.Field field = ParkingSlot.class.getDeclaredField("slotId");
            field.setAccessible(true);
            return field.getInt(slot) == id;
        } catch (Exception e) {
            return false;
        }
    }
}

