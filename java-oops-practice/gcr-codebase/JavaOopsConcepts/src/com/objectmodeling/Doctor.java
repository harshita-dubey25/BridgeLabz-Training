package com.objectmodeling;

import java.util.ArrayList;

class Doctor {
    private int doctorId;
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Communication between Doctor and Patient
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public String getName() {
        return name;
    }
}
