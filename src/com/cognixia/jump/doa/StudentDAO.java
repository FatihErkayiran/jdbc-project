package com.cognixia.jump.doa;

import java.util.List;

import com.cognixia.jump.models.Student;

public interface StudentDAO {

	public List<Student> getAllStudents();
	
	public Student getStudentById();
	
	public boolean addStudent(Student student);
	
	public boolean updateStudent(Student student);
	
	public boolean deleteStudent(int id);
	
}
