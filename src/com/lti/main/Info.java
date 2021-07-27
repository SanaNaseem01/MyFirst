package com.lti.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.lti.model.Course;
import com.lti.model.Student;

public class Info {
	public static void display(Student student) {
		// System.out.println(student.getId()+" "+student.getName()+"
		// "+student.getDateOfBirth()+" "+student.getCollegeName());
		System.out.println(student.getId() + " " + student.getName() + " " + student.getDateOfBirth() + " "
				+ Student.getCollegeName() + " " + Arrays.toString(student.getPhoneNumbers()));
	}

	public static void display(Student[] students) {
		/*
		 * for(int i=0;i<students.length;i++) { display(students[i]); }
		 */
		for (Student st : students) {
			display(st); // enhanced/extended for loop
		}
	}

	public static void display(List<Student> students){
		// for(Student st:students)
		// display(st);

		Iterator<Student> studs = students.iterator();
		while (studs.hasNext())

		{
			Student st = studs.next();
			display(st);
		}

	}

/*	public static void display1 (Course course) {
		
	*	//System.out.println(course.getId() + " " + course.getName() + " " + course.getDuration() + " "+ course.getFees());
	*}
	*public static void display1(Course[] courses) {
		
	*	for (Course co : courses) {
	*		display1(co); // enhanced/extended for loop
	*	}
	*}
	*public static void display1 (List<Course> courses) {
		

	*	Iterator<Course> cours = courses.iterator();
	*	while (cours.hasNext())

	*	{
	*		Course co = cours.next();
	*		display1(co);
	*	}

	}*/
	public static void displayCourse(Course course) {
		course.calculateMonthlyFee();
	}
	
	
}
