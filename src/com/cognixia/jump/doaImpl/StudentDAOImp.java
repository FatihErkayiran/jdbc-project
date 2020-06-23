package com.cognixia.jump.jdbc.project;

import java.util.List;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
