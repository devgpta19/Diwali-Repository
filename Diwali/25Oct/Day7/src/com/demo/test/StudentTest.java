package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FIle Name with ext.");
		String fileName = sc.next();
		
		StudentService sservice = new StudentServiceImpl();
		int choice = 0;
		
		sservice.readFile(fileName);
		
		do {
			
			System.out.println("1. Add Student\n2. Calculate Score\n3. Save in File\n"
					+ "4. Show All\n5. EXIT");
			
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1->{
				boolean status = sservice.addStudent();
				if(status)
					System.out.println("Student Added Successfully");
				else
					System.out.println("Something Went Wrong");
			}
			
			case 3->{
				boolean status = sservice.saveAllToFile(fileName);
				if(status)
					System.out.println("SuccessFully Added to the File");
				else
					System.out.println("Something Went Wrong");
			}

			case 4->{
				List<Student> lst = sservice.showAll();
				lst.forEach(System.out::println);
			}
			case 5->{
				System.out.println("Exit Successfull");
				sc.close();
				System.exit(0);
			}
			}
			
		}while(choice!=5);

	}

}
