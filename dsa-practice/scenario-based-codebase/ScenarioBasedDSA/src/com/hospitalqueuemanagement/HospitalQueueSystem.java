package com.hospitalqueuemanagement;

public class HospitalQueueSystem {
    public static void main(String[] args) {

        HospitalAVL hospital = new HospitalAVL();

        hospital.root = hospital.insert(hospital.root, "P101", "Ramesh", 900);
        hospital.insert(hospital.root, "P102", "Sita", 930);
        hospital.insert(hospital.root, "P103", "Amit", 915);
        hospital.insert(hospital.root, "P104", "Neha", 1000);

        System.out.println("🏥 Patients by Arrival Time:");
        hospital.inorder(hospital.root);

        System.out.println("\n🚑 Discharging patient at 915...");
        hospital.root = hospital.delete(hospital.root, 915);

        System.out.println("\n🏥 Updated Queue:");
        hospital.inorder(hospital.root);
    }
}
