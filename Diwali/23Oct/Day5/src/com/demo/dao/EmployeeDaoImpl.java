package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	static List<Employee> lst;
	static {
		lst = new ArrayList<>();
	}
	
	@Override
	public void readData(String string) {

		File f = new File("empoyee.txt");
		if (f.exists())
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
				while (true) {
					try {
						Employee e = (Employee)ois.readObject();
						lst.add(e);
					} catch (EOFException e) {
						System.out.println("Reached end of file.");
						break;
					}
				}
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
	}


	@Override
	public boolean saveEmployee(Employee e) {

		lst.add(e);

		return true;
	}

	@Override
	public boolean removeEmployee(int id) {

		for (Employee e : lst) {
			if (e.getEmpId() == id)
				return lst.remove(e);
		}

		return false;
	}

	@Override
	public List<Employee> showAllEmp() {
		// TODO Auto-generated method stub
		return lst;
	}

	@Override
	public List<Employee> sortedEmployee() {

		lst.sort(null);

		return lst;
	}

	@Override
	public Employee findEmplByName(String nm) {

		Optional<Employee> op = lst.stream().filter(e -> e.getEmpName().equals(nm)).findFirst();

		if (op.isPresent())
			return op.get();

		return null;
	}

	@Override
	public List<Employee> findEmplsByName(String nm) {

		List<Employee> op = lst.stream().filter(e -> e.getEmpName().equals(nm)).collect(Collectors.toList());

		if (op != null)
			return op;

		return null;
	}

	@Override
	public boolean addedToFile(String fname) {
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname))){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

}
