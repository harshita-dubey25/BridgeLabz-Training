package com;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

    private LinkedList<String> roundabout = new LinkedList<>();

    private Queue<String> waitingQueue = new LinkedList<>();

    private int capacity;

    public TrafficManager(int capacity) {
        this.capacity = capacity;
    }

    public void addVehicle(String vehicle) {
        if (roundabout.size() < capacity) {
            roundabout.add(vehicle);
            System.out.println(vehicle + " entered the roundabout.");
        } else {
            waitingQueue.offer(vehicle);
            System.out.println("Roundabout full. " + vehicle + " added to waiting queue.");
        }
    }

    public void removeVehicle() {
        if (roundabout.isEmpty()) {
            System.out.println("Underflow: No vehicles in the roundabout.");
            return;
        }

        String removed = roundabout.removeFirst();
        System.out.println(removed + " exited the roundabout.");

        if (!waitingQueue.isEmpty()) {
            String next = waitingQueue.poll();
            roundabout.add(next);
            System.out.println(next + " moved from queue to roundabout.");
        }
    }

    public void displayRoundabout() {
        if (roundabout.isEmpty()) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("Roundabout State (Circular): ");
        for (int i = 0; i < roundabout.size(); i++) {
            System.out.print(roundabout.get(i) + " → ");
        }
        System.out.println(roundabout.getFirst() + " (back to start)");
    }

    public void displayQueue() {
        System.out.println("Waiting Queue: " + waitingQueue);
    }

    public static void main(String[] args) {
        TrafficManager tm = new TrafficManager(3);

        tm.addVehicle("Car-A");
        tm.addVehicle("Car-B");
        tm.addVehicle("Car-C");
        tm.addVehicle("Car-D");

        tm.displayRoundabout();
        tm.displayQueue();

        tm.removeVehicle();
        tm.displayRoundabout();
        tm.displayQueue();

        tm.removeVehicle();
        tm.removeVehicle();
        tm.removeVehicle(); 
    }
}
