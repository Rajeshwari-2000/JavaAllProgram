package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
	private StudentDao sdao;

	public StudentServiceImpl() {
		super();
		sdao=new StudentDaoImpl();
	}


	@Override
	public void addnewStudent(int ch) {

		Scanner sc=new Scanner(System.in); 
		System.out.println("enter student id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter address");
		String addr=sc.next();
		System.out.println("enter birth date(dd/MM/yyyy)");
		String bdt=sc.next();
		LocalDate ldt=LocalDate.parse(bdt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		int[] mks=new int[2];
		if(ch==1 || ch==2) {
			System.out.println("Enter marks 1");
			mks[0]=sc.nextInt();
			System.out.println("Enter marks 2");
			mks[1]=sc.nextInt();
		}
		Student s=null;
		if(ch==1) {
			System.out.println("enter thesis sub");
			String sub=sc.next();
			System.out.println("enter graduation degree");
			String degree=sc.next();
			System.out.println("enter thesis marks");
			int marks=sc.nextInt();
			s=new MasterStudent(id, nm, addr, ldt, mks, sub, degree, marks);

		}else if (ch==2){
			System.out.println("enter Special subject marks");
			int marks=sc.nextInt();
			s=new GraduateStudent(id, nm, addr, ldt, mks, marks);
		}else {

		}
		sdao.addStudent(s);	
	}

	@Override
	public boolean deleteById(int id) {
		return sdao.removeById(id);
	}

	@Override
	public boolean modifyStudentMarks(int id, int newmarks) {
		return sdao.updateMarks(id,newmarks);
	}

	@Override
	public Student getById(int id) {
		return  sdao.findById(id);
	}

	@Override
	public List<Student> getByMarks(int mks) {
		return sdao.findByMarks(mks);
	}

	@Override
	public List<Student> sortById() {
		return sdao.sortById();
	}

	@Override
	public List<Student> sortByName() {
		return sdao.sortByName();
	}

	@Override
	public List<Student> sortByMarks() {
		return sdao.sortByMarks();
	}

	@Override
	public List<Student> getAllStudents() {
		return sdao.findAllStudent();
	}

	@Override
	public List<Student> getByName(String nm) {
		return sdao.findByName(nm);
	}

}
