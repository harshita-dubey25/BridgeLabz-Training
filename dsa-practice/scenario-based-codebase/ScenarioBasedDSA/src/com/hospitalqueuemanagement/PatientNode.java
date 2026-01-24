package com.hospitalqueuemanagement;

class PatientNode {
    int checkInTime;
    int height;
    String patientId;
    String name;

    PatientNode left, right;

    PatientNode(String id, String name, int time) {
        this.patientId = id;
        this.name = name;
        this.checkInTime = time;
        height = 1;
    }
}
