package com.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	static EmployeeDao edao;

	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
	}

	static Scanner sc = new Scanner(System.in);
	
	@Override
	public void readFile(String string) {
		edao.readData(string);
	}

	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub

		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Role : ");
		String role = sc.nextLine();
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		sc.nextLine();

		Employee e = new Employee(id, name, role);

		return edao.saveEmployee(e);
	}

	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.showAllEmp();
	}

	@Override
	public boolean removeEmp(int id) {
		// TODO Auto-generated method stub
		return edao.removeEmployee(id);
	}

	@Override
	public List<Employee> sortEmpl() {
		// TODO Auto-generated method stub
		return edao.sortedEmployee();
	}

	@Override
	public Employee findByName(String nm) {
		// TODO Auto-generated method stub
		return edao.findEmplByName(nm);
	}

	@Override
	public List<Employee> findEmplsByName(String nm) {
		// TODO Auto-generated method stub
		return edao.findEmplsByName(nm);
	}

	@Override
	public void codingChallange() {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value of 'k' for Right shift ");
		int k = sc.nextInt();

		rotate(arr, k);

	}

	private void rotate(int[] arr, int k) {

		int n = arr.length;
		k = k % n;

		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);

		System.out.println(Arrays.toString(arr));

	}

	public static int[] reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}

		return arr;
	}

	@Override
	public boolean addtoFile(String fname) {
		
		return edao.addedToFile(fname);
	}

}
