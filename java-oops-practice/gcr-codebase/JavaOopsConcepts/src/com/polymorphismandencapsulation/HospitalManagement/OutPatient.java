package com.polymorphismandencapsulation.HospitalManagement;

class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(String patientId, String name, int age, String diagnosis,
                      double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}
