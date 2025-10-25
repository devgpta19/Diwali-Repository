package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	void readFile(String fileName);

	boolean addStudent();

	boolean saveAllToFile(String fname);

	List<Student> showAll();

}
