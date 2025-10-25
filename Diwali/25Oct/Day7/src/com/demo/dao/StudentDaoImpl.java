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
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {

	private static Set<Student> lst = new TreeSet<>();

	@Override
	public void readFile(String fileName) {
		File fname = new File(fileName);

		if (fname.exists())
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname))) {
				while (true) {
					try {
						Student s = (Student) ois.readObject();
						lst.add(s);
					} catch (EOFException e) {
						System.out.println("Reached the End Of File.");
						break;
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("Didn't Found the File.");

			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		System.out.println("File Readed Successfully");
	}

	@Override
	public boolean saveStudent(Student student) {
		if(student==null) return false;
		lst.add(student);
		return true;
	}

	@Override
	public void calcGrade() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean writeToFile(String fname) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))){
			for(Student s : lst) {
				oos.writeObject(s);
			}
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found While Writting");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}

	@Override
	public List<Student> display() {
		List<Student> list = new ArrayList<>();
		for(Student s : lst) {
			list.add(s);
		}
		
		return list;
		
	}

}
