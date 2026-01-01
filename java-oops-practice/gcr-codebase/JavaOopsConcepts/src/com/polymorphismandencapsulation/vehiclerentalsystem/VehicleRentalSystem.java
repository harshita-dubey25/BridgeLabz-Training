package com.polymorphismandencapsulation.vehiclerentalsystem;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("MH12AB1234", "POL123456"),
            new Bike("MH14XY5678", "POL654321"),
            new Truck("MH20TR9999", "POL888777")
        };

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: ₹"
                    + v.calculateRentalCost(rentalDays));
            System.out.println(v.getInsuranceDetails());
            System.out.println("Insurance Cost: ₹" + v.calculateInsurance());
            System.out.println();
        }
    }
}
