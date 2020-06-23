package com.cognixia.jump.doaImpl;

import java.util.List;

import com.cognixia.jump.doa.StudentDAO;
import com.cognixia.jump.models.Student;

public class StudentDAOImp implements StudentDAO {

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addStudent(Student student) {
		
		// insert into student values(id, fname, lname, gender, dob, credits, addr_id, dept_id);
		
		// grab the id for the department
		int deptId = student.getDept().getId();
		
		// grab the id for the address
		int addrId = student.getAddress().getId();
		
		// add in your values to statement
		
		
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
