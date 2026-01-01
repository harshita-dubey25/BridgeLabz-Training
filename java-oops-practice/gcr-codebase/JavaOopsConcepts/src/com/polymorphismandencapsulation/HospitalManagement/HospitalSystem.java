package com.polymorphismandencapsulation.HospitalManagement;

public class HospitalSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(
                "IP101", "Amit", 45, "Fracture",
                5, 2000
        );

        Patient p2 = new OutPatient(
                "OP202", "Riya", 30, "Fever",
                500
        );

        p1.addRecord("X-Ray done");
        p1.addRecord("Surgery performed");

        p2.addRecord("Blood test done");

        Patient[] patients = {p1, p2};

        for (Patient p : patients) {
            p.getPatientDetails();
            p.viewRecords();
            System.out.println("Total Bill: ₹" + p.calculateBill());
            System.out.println();
        }
    }
}
