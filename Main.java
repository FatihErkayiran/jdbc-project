package com.cognixia.jump.jdbc.project;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
  
		StudentDAO stuDao = new StudentDAOImp();  // get all, get by id, add, update, delete 
		AddressDAO addrDao = new AddressDAOImp(); // get by ID, update, add
		
		
		// switch statement
		System.out.println("1. Retrive all students");
		 System.out.println("2. Retrive a single student by id");
		 System.out.println("3. Update a student");
		 System.out.println("4. Delete a student");
		 System.out.println("5. Add a new student");
		 System.out.println("--------------------");
		 System.out.println("Please input an integer between 1 to 5:");
		 Scanner scan = new Scanner(System.in);	
		 int input = scan.nextInt();
		 
		 switch (input) {
		 
		 case 1:
			 // get all student
			 System.out.println("Get all Students.");
				for( Student stu : stuDao.getAllStudents()) {
					System.out.println(stu);
				}
			 break;
		 
		 case 2:
			 // get student by id
			 Student stu = stuDao.getStudentById(10000);
				System.out.println("\nStudent: " + stu);
			 break;
		 
		 case 3:
				
			// update a student
				Student toUpdate = stuDao.getAllStudents().get(0);
				
			
				Scanner sc = new Scanner(System.in);
				
				System.out.println("First Name: ");
				String fn = sc.nextLine();
				toUpdate.setFirstName(fn);
				
				System.out.println("Last Name: ");
				String ln = sc.nextLine();
				toUpdate.setLastName(ln);
				
				System.out.println("Gender: ");
				String gen = sc.nextLine();
				toUpdate.setGender(gen);
				
				System.out.println("Date of Birth (formate): ");
				// tried to use a scanner to input date
				toUpdate.setDob(null);
				
				System.out.println("Credits: ");
				int cdt = sc.nextInt();
				toUpdate.setCredits(cdt);
				
				toUpdate.setAddress(address);
				
				
				
				scan.close();
				
				boolean updated = stuDao.updateStudent(toUpdate);
				
				if(updated) {
					System.out.println("Updated student");
				}
				
			 break;
		 
		 case 4:
				// delete a student
			 	Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter the student id to delete:");
			     int del = sc2.nextInt();
				boolean deleted = stuDao.deleteStudent(del);
				scan.close();
				if(deleted) {
					System.out.println("Student deleted");
				}
			 break;
		
		 case 5:
				// add a student
			 	Scanner sc3 = new Scanner(System.in);
			 	System.out.println("Please enter student information");
			 	System.out.println("\nFirst Name: ");
			 	fn = sc3.nextLine();
			 	
			 	System.out.println("\nLast Name: ");
			 	ln = sc3.nextLine();
			 	
			 	System.out.println("\nGender: ");
			 	gen = sc3.nextLine();
			 	
			 	System.out.println("\nDate Of Birth(formate): ");
			 	// input dob
			 	
			 	System.out.println("\nTotal Credit: ");
			 	cdt = sc3.nextInt();
			 	
			 	System.out.println("Address: ");
			 	// input address
			 	
				Student newStu = new Student(fn, ln, gen, "dob", cdt, "address");
				boolean added = stuDao.addStudent(newStu);
				
				if (added) {
					System.out.println("Added new student");
				}
			 break;
		 
		 }
		 
		 scan.close();

	
	}
}
