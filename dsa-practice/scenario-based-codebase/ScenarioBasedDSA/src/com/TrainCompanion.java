package com;

import java.util.LinkedList;
import java.util.ListIterator;

public class TrainCompanion {

    // Doubly Linked List of compartments
    private LinkedList<String> compartments = new LinkedList<>();

    // Add compartment at end
    public void addCompartment(String name) {
        compartments.add(name);
        System.out.println(name + " compartment added.");
    }

    // Remove a compartment
    public void removeCompartment(String name) {
        if (compartments.remove(name)) {
            System.out.println(name + " compartment removed.");
        } else {
            System.out.println("Compartment not found.");
        }
    }

    // Traverse forward
    public void traverseForward() {
        System.out.println("\nForward Traversal:");
        for (String comp : compartments) {
            System.out.print(comp + " → ");
        }
        System.out.println("END");
    }

    // Traverse backward
    public void traverseBackward() {
        System.out.println("\nBackward Traversal:");
        ListIterator<String> iterator = compartments.listIterator(compartments.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " → ");
        }
        System.out.println("START");
    }

    // Show adjacent compartments
    public void showAdjacent(String current) {
        int index = compartments.indexOf(current);

        if (index == -1) {
            System.out.println("Compartment not found.");
            return;
        }

        String prev = (index > 0) ? compartments.get(index - 1) : "None";
        String next = (index < compartments.size() - 1) ? compartments.get(index + 1) : "None";

        System.out.println("\nCurrent Compartment: " + current);
        System.out.println("Previous Compartment: " + prev);
        System.out.println("Next Compartment: " + next);
    }

    // Main method
    public static void main(String[] args) {
        TrainCompanion train = new TrainCompanion();

        train.addCompartment("Engine");
        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("AC Coach");
        train.addCompartment("General");

        train.traverseForward();
        train.traverseBackward();

        train.showAdjacent("Pantry");

        train.removeCompartment("General");

        train.traverseForward();
    }
}
