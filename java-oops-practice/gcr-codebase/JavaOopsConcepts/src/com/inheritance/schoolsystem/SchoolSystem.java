package com.inheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Harshita", 19, "BTech");
        Staff st = new Staff("Ramesh", 45, "Administration");

        t.displayRole();
        t.showDetails();
        System.out.println();

        s.displayRole();
        s.showDetails();
        System.out.println();

        st.displayRole();
        st.showDetails();
    }
}
