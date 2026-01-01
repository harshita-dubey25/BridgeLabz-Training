package com.inheritance.vehicle;

class Motorcycle extends Vehicle {
    private boolean hasGear;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vehicle Type: Motorcycle");
        super.displayInfo();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}
