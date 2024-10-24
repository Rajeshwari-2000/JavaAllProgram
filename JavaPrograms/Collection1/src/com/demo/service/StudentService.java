package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	void addnewStudent(int ch);

	boolean deleteById(int id);

	boolean modifyStudentMarks(int id, int newmarks);

	Student getById(int id);

	List<Student> getByMarks(int mks);

	List<Student> sortById();

	List<Student> sortByName();

	List<Student> sortByMarks();

	List<Student> getAllStudents();

	List<Student> getByName(String nm);



}
