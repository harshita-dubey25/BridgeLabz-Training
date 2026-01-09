package ParkEase;

class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50); // base rate per hour
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > 5 ? 100 : 0;
        return (baseRate * hours) + penalty;
    }
}
