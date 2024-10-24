package com.beans;

public class SalaryEmp extends Person{
private float BSalary;

public SalaryEmp() {
	super();
	// TODO Auto-generated constructor stub
}

public SalaryEmp(float bSalary) {
	super();
	BSalary = bSalary;
}

public float getBSalary() {
	return BSalary;
}

public void setBSalary(float bSalary) {
	BSalary = bSalary;
}

@Override
public String toString() {
	return "SalaryEmp [BSalary=" + BSalary + "]";
}

}
