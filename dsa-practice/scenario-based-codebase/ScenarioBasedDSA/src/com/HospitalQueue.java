package com;

class Patient {
    String name;
    int criticality;

    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }
}

public class HospitalQueue {

    static void sortByCriticality(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (patients[j].criticality < patients[j + 1].criticality) {
                    // Swap adjacent patients
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    static void display(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p.name + " - Criticality: " + p.criticality);
        }
    }

    public static void main(String[] args) {
        Patient[] patients = {
            new Patient("Ravi", 4),
            new Patient("Anita", 9),
            new Patient("Kiran", 6),
            new Patient("Meena", 2)
        };

        System.out.println("Before Sorting:");
        display(patients);

        sortByCriticality(patients);

        System.out.println("\nAfter Sorting by Criticality:");
        display(patients);
    }
}
