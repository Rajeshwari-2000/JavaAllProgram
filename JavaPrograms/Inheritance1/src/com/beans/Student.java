package com.beans;

import java.time.LocalDate;
import java.util.Arrays;

abstract public class Student extends Person{
		protected int[] marks;

		public Student() {
			System.out.println("In student Default Constructor called..");
		}

		public Student(int pid, String pname, String address, LocalDate bdate,int[] marks) {
			super(pid,pname,address,bdate);
			this.marks = marks;
			System.out.println("In student parameterized Constructor called..");
			this.marks=marks;
		}

		public int[] getMarks() {
			return marks;
		}

		public void setMarks(int[] marks) {
			this.marks = marks;
		}
		abstract public float calculateGrade();

		@Override
		public String toString() {
			return super.toString()+"Student [marks=" + Arrays.toString(marks) + "]";
		} 	
		
}
