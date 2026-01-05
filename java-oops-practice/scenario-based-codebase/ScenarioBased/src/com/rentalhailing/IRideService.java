package com.rentalhailing;

public interface IRideService {
	void bookRide(String passengerName, Vehicle vehicle, double distance);
	void endRide();
}