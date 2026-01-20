package com;

import java.util.*;

class Vehicle {
    String vehicleId;
    int mileage;

    Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return vehicleId + " (" + mileage + " km)";
    }
}

public class FleetManager {

    // Merge two sorted vehicle lists
    private static List<Vehicle> merge(List<Vehicle> a, List<Vehicle> b) {
        List<Vehicle> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i).mileage <= b.get(j).mileage) {
                result.add(a.get(i++));
            } else {
                result.add(b.get(j++));
            }
        }

        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));

        return result;
    }

    // Merge multiple sorted depot lists
    public static List<Vehicle> mergeAllDepots(List<List<Vehicle>> depots) {
        while (depots.size() > 1) {
            List<Vehicle> first = depots.remove(0);
            List<Vehicle> second = depots.remove(0);
            depots.add(merge(first, second));
        }
        return depots.get(0);
    }

    public static void main(String[] args) {

        List<Vehicle> depot1 = Arrays.asList(
                new Vehicle("V1", 12000),
                new Vehicle("V2", 18000),
                new Vehicle("V3", 25000)
        );

        List<Vehicle> depot2 = Arrays.asList(
                new Vehicle("V4", 10000),
                new Vehicle("V5", 20000),
                new Vehicle("V6", 30000)
        );

        List<Vehicle> depot3 = Arrays.asList(
                new Vehicle("V7", 15000),
                new Vehicle("V8", 22000)
        );

        List<List<Vehicle>> depots = new ArrayList<>();
        depots.add(depot1);
        depots.add(depot2);
        depots.add(depot3);

        List<Vehicle> masterSchedule = mergeAllDepots(depots);

        System.out.println("Master Maintenance Schedule:");
        masterSchedule.forEach(System.out::println);
    }
}
