package com.universityrecord;

class StudentNode {
    int rollNo;
    String name;
    StudentNode left, right;

    StudentNode(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        left = right = null;
    }
}
