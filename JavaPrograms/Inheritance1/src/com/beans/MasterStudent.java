package com.beans;


import java.time.LocalDate;

public class MasterStudent extends Student{
	private String thesissub,degree;
	private int thesismarks;
	public MasterStudent() {
		
	}
	public MasterStudent(int pid, String pname, String address, LocalDate bdate,int[] marks,String thesissub, String degree, int thesismarks) {
		
		super(pid,pname,address,bdate,marks);
		System.out.println("in MasterStudent parametrized constructor");
		this.thesissub = thesissub;
		this.degree = degree;
		this.thesismarks = thesismarks;
	}
	public String getThesissub() {
		return thesissub;
	}
	public void setThesissub(String thesissub) {
		this.thesissub = thesissub;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getThesismarks() {
		return thesismarks;
	}
	public void setThesismarks(int thesismarks) {
		this.thesismarks = thesismarks;
	}
	public float calculateGrade() {
	
		return ((marks[0]+marks[1])*0.20f)+thesismarks;
	}
	@Override
	public String toString() {
		return super.toString()+"MasterStudent [thesissub=" + thesissub + ", degree=" + degree + ", thesismarks=" + thesismarks + "]";
	}
	

}
