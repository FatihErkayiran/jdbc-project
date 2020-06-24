package com.cognixia.jump.doaImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.doa.StudentDAO;
import com.cognixia.jump.connection.ConnectionManager;
import com.cognixia.jump.models.Student;

public class StudentDAOImp implements StudentDAO {
	
	
	private Connection connection;
	
	private Statement statement;

	@Override
	public  List<Student> getAllStudents() {
		
		String query = "SELECT * FROM student";
		
		List<Student> list = new ArrayList<Student>();
		Student student = null;
		ResultSet rs = null;
		
		try {
			
			connection = ConnectionManager.getConnection();
			statement = connection.createStatement();
			
			rs = statement.executeQuery(query);
			
			while (rs.next()) {
				
				
				
				int id = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String gender = rs.getString(4);
				Date dob = rs.getDate(5);
				int credits = rs.getInt(6);
				int studentAddress = rs.getInt(7);
				int studentDept = rs.getInt(8);
				
				
				student = new Student(id, firstName, lastName, gender, dob, credits, studentAddress, studentDept);
				
				list.add(student);
				
				
			}
			
			rs.close();
			statement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}

		return list;
	}

	@Override
	public Student getStudentById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addStudent(Student student) {
		
		 String query = "insert into student (id, first_name, last_name, gender, date_of_birth, credits, addr_id, dept_id)"
			        + " values (?, ?, ?, ?, ?, ?, ?, ?)"; 
		
		try {
			
			
			connection = ConnectionManager.getConnection();
			
			PreparedStatement preparedStmt = connection.prepareStatement(query);
			
			preparedStmt.setString(2,student.getFirstName());
			preparedStmt.setString(3,student.getLastName());
			preparedStmt.setString(4,student.getGender());
			preparedStmt.setDate(5,student.getDob());
			preparedStmt.setInt(6,student.getCredits());
			preparedStmt.setInt(7,student.getAddress().getId());
			preparedStmt.setInt(8,student.getDept().getId());
			
			
		      // execute the preparedstatement
		      preparedStmt.execute();
		 
		      connection.close();
			
		} catch (SQLException e) {
			 System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		}
		
		
		
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		// cols: first_name, last_name, gender, date_of_birth, credits, address_id, dept_id

		try(PreparedStatement pstmt = conn.prepareStatement("update student set first_name = ?, last_name = ?, gender = ?, date_of_birth = ?, credits = ?, address_id = ?, dept_id = ?");) {
			pstmt.setString(1, student.getFirstName());
			pstmt.setString(2, student.getLastName());
			pstmt.setString(3, student.getGender());
			pstmt.setDate(4, student.getDob());
			pstmt.setInt(5, student.getCredits());
			pstmt.setInt(6, student.getAddress().getId());
			pstmt.setInt(7, student.getDept().getId());
			
			int update = pstmt.executeUpdate();
			
			if (update > 0) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return false;
	}


	@Override
	public boolean deleteStudent(int id) {
		try(PreparedStatement pstmt = conn.prepareStatement("delete from student where student_id = ?")) {
			pstmt.setInt(1, id);
			int deleted = pstmt.executeUpdate();
			if (deleted > 0) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
