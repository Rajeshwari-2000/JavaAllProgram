package com.beans;

import java.time.LocalDate;

public class Person {
	private int pid;
	private String pname;
	private String address;
	private LocalDate bdate;
	public Person() {
		super();
		System.out.println(" In person Default Constructor called............");
	}
	public Person(int pid, String pname, String address, LocalDate bdate) {
		super();
		System.out.println("In person parametrized constructor called..........");
		this.pid = pid;
		this.pname = pname;
		this.address = address;
		this.bdate = bdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBdate() {
		return bdate;
	}
	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address + ", bdate=" + bdate + "]";
	}
	
}
