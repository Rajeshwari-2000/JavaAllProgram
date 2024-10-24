package com.demo.beans;

public class Student {
	private int studId;
	private String sName;
	private int m1,m2,m3;
	public Student() {
		super();
	}
	public Student(int studId, String sName, int m1, int m2, int m3) {
		super();
		this.studId = studId;
		this.sName = sName;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", sName=" + sName + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	

}
