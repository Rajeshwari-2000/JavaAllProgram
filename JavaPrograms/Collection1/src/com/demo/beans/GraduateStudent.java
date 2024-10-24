package com.demo.beans;
import java.time.LocalDate;

public class GraduateStudent extends Student{
	private int spsub;

	public GraduateStudent() {
		super();
	}

	public GraduateStudent(int pid, String pname, String address, LocalDate bdate,int[] marks,int spsub) {
		
		super(pid,pname,address,bdate,marks);
		
		this.spsub = spsub;
	}

	public int getSpsub() {
		return spsub;
	}

	public void setSpsub(int spsub) {
		this.spsub = spsub;
	}
	
	public float calculateGrade() {
		
		return ((marks[0]+marks[1])*0.50f)+spsub;
	}

	@Override
	public String toString() {
		return super.toString()+"GraduateStudent [spsub=" + spsub + "]";
	}
	

}
