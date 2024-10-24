package com.beans;

import java.time.LocalDate;

public class Employee extends Person{
private String Department;
private String Designation;
private LocalDate DateOfJoin;
public Employee() {
	super();
	
}
public Employee(String department, String designation, LocalDate dateOfJoin) {
	super();
	Department = department;
	Designation = designation;
	DateOfJoin = dateOfJoin;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
public LocalDate getDateOfJoin() {
	return DateOfJoin;
}
public void setDateOfJoin(LocalDate dateOfJoin) {
	DateOfJoin = dateOfJoin;
}
@Override
public String toString() {
	return "Employee [Department=" + Department + ", Designation=" + Designation + ", DateOfJoin=" + DateOfJoin + "]";
}


}
