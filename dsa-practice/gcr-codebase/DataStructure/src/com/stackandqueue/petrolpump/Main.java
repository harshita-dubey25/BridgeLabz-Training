package com.stackandqueue.petrolpump;

public class Main {
	public static void main(String[] args) {
		CircularTour c = new CircularTour();
        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};

        int start = c.findStartingPump(petrol, distance);
        System.out.println("Starting Pump Index = " + start);
    }
}
