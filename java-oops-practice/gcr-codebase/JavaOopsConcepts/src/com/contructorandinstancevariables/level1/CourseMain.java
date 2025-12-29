package com.contructorandinstancevariables.level1;

public class CourseMain {

	public static void main(String[] args) {
		
		Course c1 = new Course("B.tech",4,70000);
		c1.displayCourseDetails();
		
		Course c2 = new Course("B.tech",4,70000);
		c2.updateInstituteName();
		c2.displayCourseDetails();
		c1.displayCourseDetails();
			
	}

}
