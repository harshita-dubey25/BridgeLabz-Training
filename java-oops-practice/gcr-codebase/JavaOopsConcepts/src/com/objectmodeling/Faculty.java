package com.objectmodeling;

class Faculty {
    private int facultyId;
    private String name;

    public Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
