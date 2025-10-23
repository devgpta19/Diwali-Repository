package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void readFile(String string);
	
	boolean addEmployee();

	List<Employee> displayAll();

	boolean removeEmp(int id);

	List<Employee> sortEmpl();

	Employee findByName(String nm);

	List<Employee> findEmplsByName(String nm);

	void codingChallange();

	boolean addtoFile(String fname);

}
