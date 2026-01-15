package com;

import java.util.*;

public class AmbulanceRoute {

    private LinkedList<String> units;
    private int currentIndex;

    public AmbulanceRoute() {
        units = new LinkedList<>();
        currentIndex = 0;

        units.add("Emergency");
        units.add("Radiology");
        units.add("Surgery");
        units.add("ICU");
    }

    public void displayUnits() {
        System.out.println("\nHospital Units (Circular Route):");
        for (String unit : units) {
            System.out.print(unit + " → ");
        }
        System.out.println("(Back to " + units.getFirst() + ")");
    }

    public void redirectPatient() {
        if (units.isEmpty()) {
            System.out.println("No units available!");
            return;
        }

        System.out.println("Patient redirected to: " + units.get(currentIndex));

        currentIndex = (currentIndex + 1) % units.size();
    }
    
    public void removeUnit(String unitName) {
        if (units.remove(unitName)) {
            System.out.println(unitName + " is under maintenance and removed.");
            if (currentIndex >= units.size()) {
                currentIndex = 0;
            }
        } else {
            System.out.println("Unit not found.");
        }
    }

    public void addUnit(String unitName) {
        units.add(unitName);
        System.out.println(unitName + " added to the route.");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();

        while (true) {
            System.out.println("\n===== Ambulance Route Menu =====");
            System.out.println("1. Display Hospital Units");
            System.out.println("2. Redirect Patient");
            System.out.println("3. Remove Unit (Maintenance)");
            System.out.println("4. Add New Unit");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    route.displayUnits();
                    break;

                case 2:
                    route.redirectPatient();
                    break;

                case 3:
                    System.out.print("Enter unit name to remove: ");
                    String removeUnit = sc.nextLine();
                    route.removeUnit(removeUnit);
                    break;

                case 4:
                    System.out.print("Enter new unit name: ");
                    String addUnit = sc.nextLine();
                    route.addUnit(addUnit);
                    break;

                case 5:
                    System.out.println("Exiting Ambulance Route System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
