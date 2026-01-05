package com.rentalhailing;

public class RideBookingSystem implements IRideService{
	private boolean isActive;
    private double currentFare;
    
    @Override
    public void bookRide(String passengerName, Vehicle vehicle, double distance) {
        this.isActive = true;
        this.currentFare = vehicle.getBaseFare() + (distance * vehicle.getRatePerKm());
        
        System.out.println("Ride booked for " + passengerName);
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Estimated Fare: $" + currentFare);
    }

    @Override
    public void endRide() {
        if (isActive) {
            System.out.println("Ride ended. Total amount processed: $" + currentFare);
            isActive = false;
        }
    }
}