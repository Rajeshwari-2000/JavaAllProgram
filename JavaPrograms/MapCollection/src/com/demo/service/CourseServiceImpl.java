package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Course;
import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;
import com.demo.exception.CourseNotFound;
import com.demo.exception.NoCourseDuration;

public class CourseServiceImpl implements CourseService {
	private CourseDao cdao;
	public CourseServiceImpl()
	{
		cdao=new CourseDaoImpl();
	}


	@Override
	public boolean addnewcourse() {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the course name");
		String cname=sc.next();

		System.out.println("Enter the course fees");
		double fees=sc.nextDouble();

		System.out.println("Enter capacity of course");
		int Capacity=sc.nextInt();

		System.out.println("Enter duration of the course");
		int Duration=sc.nextInt();

		Course c=new Course(cname,fees,Capacity,Duration);

		return cdao.save(c);
	}


	@Override
	public boolean deleteByName(String cname) {
		return cdao.deleteByName(cname);
	}


	@Override
	public boolean modifyByName(String cname, int Capacity, int Duration) throws CourseNotFound {
		return cdao.modifyByName(cname,Capacity,Duration);
	}


	

	@Override
	public boolean displayByName(String cname) {
		return cdao.displayByName(cname);
	}


	@Override
	public List<Course> FindByDuration(int duration1) throws NoCourseDuration{
		return cdao.FindByDuration(duration1);
	}


	@Override
	public List<Course> SortedByDuration() {
		return cdao.sortByDuration();
	}


	

	@Override
	public Map<String, Course> sortByName() {
		
		return cdao.sortByName();
	}


	@Override
	public Map<String, Course> getAll() {
		
		return cdao.getAll();
	}



}
