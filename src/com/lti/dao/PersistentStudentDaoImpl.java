package com.lti.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Course;
import com.lti.model.Student;

public class PersistentStudentDaoImpl implements StudentDao {
	Connection conn;
	String sql;
	PreparedStatement stmt;
	ResultSet rs;
	int rec;
	CallableStatement cstmt;

	public PersistentStudentDaoImpl() {
		// TODO Auto-generated constructor stub
		conn = ConnectionFactory.getConnection();
	}

	@Override

	public boolean addStudent(Student student) {
		/*
		 * sql = "insert into student values(seq_student.nextval,?,?)";
		 * 
		 * try { stmt = conn.prepareStatement(sql); stmt.setString(1,student.getName());
		 * stmt.setDate(2,Date.valueOf(student.getDateOfBirth()));//
		 * convertedjava.time.localDate(java8) to // java.sql.Date(old) int rec =
		 * stmt.executeUpdate();// executeUpdate method to runDML Queries if (rec > 0) {
		 * return true; } } catch (SQLException e) {
		 * 
		 * e.printStackTrace(); }
		 * 
		 * return false;
		 */

		// insert student using procedure
		sql = "{call insertStudent(?,?)}";
		int rec;
		try {
			cstmt = conn.prepareCall("");
			cstmt.setString(1, student.getName());
			cstmt.setDate(2, Date.valueOf(student.getDateOfBirth()));
			rec = cstmt.executeUpdate();
			if (rec > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updateStudent(Student student) {
		sql = "update student set name=?, dob=? where id=?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, student.getName());
			stmt.setDate(2, Date.valueOf(student.getDateOfBirth()));
			stmt.setInt(3, student.getId());
			int rec = stmt.executeUpdate();
			if (rec > 0)
				System.out.println("Record updated successfully");
			else
				System.out.println("Sorry no record found");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeStudent(int id) {
		sql = "delete from student where id=? ";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			int rec = stmt.executeUpdate();
			if (rec > 0)
				System.out.println("Record Deleted successfully");
			else
				System.out.println("Sorry no record found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Student findAStudent(int id) {
		sql = "select * from student where id=?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				Date dob = rs.getDate(3);
				Student st = new Student(id1, name, dob.toLocalDate());
				return st;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		List<Student> students = new ArrayList<Student>();
		sql = "select * from student";
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				Date dob = rs.getDate(3);
				Student st = new Student(id1, name, dob.toLocalDate());

				students.add(st);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void enroll(int studentId, int courseId) {

	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {
		return null;
	}

}
