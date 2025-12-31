package com.objectmodeling;

class Professor {
    private int professorId;
    private String name;

    public Professor(int professorId, String name) {
        this.professorId = professorId;
        this.name = name;
    }

    // Association: Professor teaches Course
    public void assignCourse(Course course) {
        course.assignProfessor(this);
        System.out.println(name + " assigned to teach " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}
