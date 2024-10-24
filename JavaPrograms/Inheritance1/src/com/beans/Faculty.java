package com.beans;

import java.time.LocalDate;

public class Faculty  extends Person {
	
	private String Skill;
	private String Specialsub;
	private float Salary;
	
	
	public Faculty() {
		super();
	}


	public Faculty(int pid, String pname, String address, LocalDate bdate,String skill, String specialsub, float salary) {
		super();
		Skill = skill;
		Specialsub = specialsub;
		Salary = salary;
	}


	public String getSkill() {
		return Skill;
	}


	public void setSkill(String skill) {
		Skill = skill;
	}


	public String getSpecialsub() {
		return Specialsub;
	}


	public void setSpecialsub(String specialsub) {
		Specialsub = specialsub;
	}


	public float getSalary() {
		return Salary;
	}


	public void setSalary(float salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Faculty [Skill=" + Skill + ", Specialsub=" + Specialsub + ", Salary=" + Salary + "]";
	}
	
}
