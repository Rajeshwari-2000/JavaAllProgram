package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeNotFound;

public interface EmployeeDao {

	void save(Employee e);

	void readDataFromFile(String fname);

	List<Employee> findAll();

	void writeToFile(String fname);

	boolean removeById(int id) throws EmployeeNotFound;

	boolean modifyById(int id, double sal) throws EmployeeNotFound;


}
