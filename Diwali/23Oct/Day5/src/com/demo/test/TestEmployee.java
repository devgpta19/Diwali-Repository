package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService eservice = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fname = sc.nextLine();
		
		eservice.readFile(fname);
		
		int choice = 0;
		
		do {
			
			System.out.println("1. Add an Employee\n2. Remove Employee\n3. Display All Employee\n4. Sort Employees on Basis of Emp_id\n"
					+ "5. Find a Employee with empName\n6. Save all Employees into file\n7.  Quit\n8. Coding Challenges");
			
			System.out.println("Enter a Choice");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1->{
				boolean status = eservice.addEmployee();
				if(status)
					System.out.println("Employee Added Successfully");
				else
					System.out.println("Something went Wrong...");
			}
			
			case 2->{
				System.out.println("Enter Id of Employee to Rmove");
				int id = sc.nextInt();
				boolean status = eservice.removeEmp(id);
				if(status)
					System.out.println("Employee Deleted Successfully");
				else
					System.out.println("Employee Not Found OR Something went wrong");
				
			}
			
			case 3->{
				List<Employee> lst = eservice.displayAll();
				for(Employee e : lst) {
					System.out.println(e);
				}
			}
			
			case 4->{
				List<Employee> lst = eservice.sortEmpl();
				lst.forEach(System.out::println);
			}
			
			case 5->{
				System.out.println("Enter Employee Name");
				sc.nextLine();
				String nm = sc.nextLine();
				Employee e = eservice.findByName(nm);
				List <Employee> el = eservice.findEmplsByName(nm);
				System.out.println(e);
			}
			
			case 6->{
				boolean status = eservice.addtoFile("employee.txt");
				if(status)
					System.out.println("Details Added to employee.txt file.");
				else
					System.out.println("Something went Wrong...");
			}
			
			case 7->{
				System.out.println("It's Over...");
				sc.close();
				System.exit(0);
			}
			
			case 8->{
				
				eservice.codingChallange();
				
			} 			
			}
			
		}while(choice!=7);

	}

}
