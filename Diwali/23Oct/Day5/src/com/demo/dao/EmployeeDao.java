package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {
	
	void readData(String string);

	boolean saveEmployee(Employee e);

	List<Employee> showAllEmp();

	boolean removeEmployee(int id);

	List<Employee> sortedEmployee();

	Employee findEmplByName(String nm);
	
	List<Employee> findEmplsByName(String nm);

	boolean addedToFile(String fname);

}
