package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Student;

public class StudentService {
	private static Student[]Studarr;
	private static int cnt;
	static {
		Studarr=new Student[10];
		Studarr[0]=new Student(1,"Rajeshwari",52,84,64);
		Studarr[1]=new Student(2,"Riya",54,88,44);
		
		cnt=2;
	}


	public void AddNewStudents() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id");
		int studentId=sc.nextInt();

		System.out.println("Enter the student name");
		String name=sc.next();

		System.out.println("Enter the m1 marks");
		float m1=sc.nextFloat();

		System.out.println("Enter the m2 marks");
		float m2=sc.nextFloat();

		System.out.println("Enter the m3 marks");
		float m3=sc.nextFloat();
		
        Student newStudent = new Student(studentId,name,m1,m2,m3);
        Studarr[cnt] = newStudent; 
        cnt++; 
        System.out.println("Student added successfully.");
	}

	

	

	public void searchById(int studentid) {
	}

	public void searchByname(String name) {
		// TODO Auto-generated method stub

	}

	public void displayStudents() {
		// TODO Auto-generated method stub
		
	}
}
	           