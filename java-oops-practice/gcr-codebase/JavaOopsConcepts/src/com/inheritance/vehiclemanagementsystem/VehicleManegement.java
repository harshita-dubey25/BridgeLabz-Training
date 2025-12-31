package com.inheritance.vehiclemanagementsystem;

public class VehicleManegement {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla",180);
        PetrolVehicle pv = new PetrolVehicle("Honda City",220);

        ev.displayDetails();
        ev.charge();

        pv.displayDetails();
        pv.refuel();
    }
}
