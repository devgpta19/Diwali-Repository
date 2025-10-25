package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.exception.AttendanceException;

public class StudentServiceImpl implements StudentService {

	private static StudentDao sdao;
	Scanner sc = new Scanner(System.in);
	static {
		sdao = new StudentDaoImpl();
	}
	
	@Override
	public void readFile(String fileName) {
		sdao.readFile(fileName);
	}

	@Override
	public boolean addStudent() {
		
		System.out.println("Enter Student Roll");
		int roll = sc.nextInt();
		System.out.println("Enter Student Name");
		sc.nextLine();
		String nm = sc.nextLine();
		System.out.println("Enter Student Course");
		String course = sc.nextLine();
		System.out.println("Enter Student Attandance Percentage");
		float perc = sc.nextFloat();
		System.out.println("Enter the Score of the Student");
		int score = sc.nextInt();
		try {
			if(perc < 60)
				throw new AttendanceException("This Student has Attendance Less than 60%.");
			Student stu = new Student(roll, nm, course, perc, score);
			return sdao.saveStudent(stu);
		}catch( AttendanceException e ) {
			System.out.println(" Student is Not Valid.");
		}
		
		return false;
	}
	
	@Override
	public boolean saveAllToFile(String fname) {
		
		return sdao.writeToFile(fname);
		
	}

	@Override
	public List<Student> showAll() {
		// TODO Auto-generated method stub
		return sdao.display();
	}

}
