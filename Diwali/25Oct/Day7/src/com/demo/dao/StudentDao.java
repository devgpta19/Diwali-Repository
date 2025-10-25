package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	void readFile(String fileName);

	boolean saveStudent(Student student);

	void calcGrade();

	boolean writeToFile(String fname);

	List<Student> display();

}
