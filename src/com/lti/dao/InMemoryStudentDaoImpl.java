package com.lti.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Course;
import com.lti.model.Student;

public class InMemoryStudentDaoImpl implements StudentDao {

	static List<Student> students = new ArrayList<Student>();
	static Set<Course> courses = new HashSet<Course>();
	static Map<Student, Course> enrollments = new HashMap<>();

	public InMemoryStudentDaoImpl() {
		students.add(new Student(1001, "John", LocalDate.of(2000, 12, 12)));
		students.add(new Student(1001, "Jack", LocalDate.of(2001, 12, 12)));
		students.add(new Student(1001, "Jacob", LocalDate.of(2001, 11, 01)));
		students.add(new Student(1001, "Jeh", LocalDate.of(2002, 11, 02)));

		courses.add(new Course(1001, "Java", 4, 3000));
		courses.add(new Course(1001, "PHP", 2, 4000));
		courses.add(new Course(1001, "Python", 3, 5000));
	}

	// Write code to find a Course
	public Course findACourse(int courseId) {
		for (Course course : courses) {
			if (course.getId() == courseId)
				return course;
		}
		return null;
	}

	@Override
	public boolean addStudent(Student student) {
		return students.add(student);

	}

	@Override
	public void updateStudent(Student student) {

		Student existingStudent = findAStudent(student.getId());// checking if a student is present with the id in the
																// collection

		if (existingStudent != null) {
			int position = students.indexOf(student);// if present, check the position of that student

			students.set(position, student);
			System.out.println("Student updated successfully");
		} else {
			System.out.println("Student not found");
		}

	}

	@Override
	public void removeStudent(int id) {
		Student existingStudent = findAStudent(id);

		if (existingStudent != null) {
			int position = students.indexOf(existingStudent);

			students.remove(position);
			System.out.println("Student has not registered");
		} else {
			System.out.println("Student not found");
		}
	}

	@Override
	public Student findAStudent(int id) {
		for (Student st : students) {// creating temp student object
			if (st.getId() == id) {
				return st;
			}
		}
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {

		return students;
	}

	@Override
	public void enroll(int studentId, int courseId) {
		// TODO Auto-generated method stub
		Student student = findAStudent(studentId);
		Course course = findACourse(courseId);

		if (student == null || course == null) {
			System.out.println("Either student or course not found");
		} else {
			enrollments.put(student, course);
			System.out.println("Ënrolled successfully");
		}
		enrollments.put(student, course);

	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {
		// TODO Auto-generated method stub
		return enrollments.entrySet();
	}

}
