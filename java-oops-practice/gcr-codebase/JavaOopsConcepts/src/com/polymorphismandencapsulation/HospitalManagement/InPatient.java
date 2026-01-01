package com.polymorphismandencapsulation.HospitalManagement;

class InPatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(String patientId, String name, int age, String diagnosis,
                     int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}
