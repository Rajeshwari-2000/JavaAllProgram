package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	void addStudent(Student s);

	List<Student> findAllStudent();

	Student findById(int id);

	boolean removeById(int id);

	boolean updateMarks(int id, int newmarks);

	List<Student> findByMarks(int mks);

	List<Student> findByName(String nm);

	List<Student> sortById();

	List<Student> sortByName();

	List<Student> sortByMarks();
}
