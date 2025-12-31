package com.objectmodeling;

public class HospitalManagement{
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor(101, "Dr. Mehta");
        Doctor d2 = new Doctor(102, "Dr. Sharma");

        Patient p1 = new Patient(201, "Harshita");
        Patient p2 = new Patient(202, "Aman");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
