package com.polymorphismandencapsulation.ridehailingapplication;

public class RideBooking {
	public static void main(String[] args) {
		
		Vehicle v1 = new Car("MP 4545","Ansh",50);
		Vehicle v2 = new Auto("HP 02","Harshita",15);
		Vehicle v3 = new Bike("MP 2525","Ashi",25); 
		
		v1.getVehicleDetails();
		System.out.println();
		v1.updateLocation("Mp Nagar");
		v2.updateLocation("Indrapuri");
		v3.updateLocation("Anand Nagar");
		
		Vehicle[] rides = {v1, v2, v3};

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for 10 km: ₹" + v.calculateFare(10));
            System.out.println();
        }
	}
}
