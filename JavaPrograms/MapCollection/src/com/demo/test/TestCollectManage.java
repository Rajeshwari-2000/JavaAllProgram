package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


import com.demo.beans.Course;
import com.demo.exception.CourseNotFound;
import com.demo.exception.NoCourseDuration;
import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;

public class TestCollectManage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CourseService cservice=new CourseServiceImpl();
		int choice=-0;
		do {
			System.out.println("\n1.Add New Course\n2.Delete Course\n3.Update Course\n4.Display All\n5.Display By Name\n6.Display Based on Duration\n7.Display in sorted order of Name\n8.Display in Sorted Order of Duration\n9.Exit\nChoice");
			choice= sc.nextInt();
			switch(choice) {

			case 1:
				boolean status=cservice.addnewcourse();
				if(status) {
					System.out.println("Added successfully....");
				}else {
					System.out.println("Duplicate Object...");
				}
				break;



			case 2:
				System.out.println("Enter the name to be deleted...");
				String cname=sc.next();
				boolean status1=cservice.deleteByName(cname);
				if(status1) {
					System.out.println("Deleted Successfully...");
				}else {
					System.out.println("Not Found...");
				}
				break;


			case 3:
				try{
					System.out.println("Enter the course to Modify..");
					cname=sc.next();

					System.out.println("ENter the Capacity of the course..");
					int Capacity=sc.nextInt();

					System.out.println("Enter the Duration of the course..");
					int Duration=sc.nextInt();

					boolean status2=cservice.modifyByName(cname,Capacity,Duration);
					if(status2) {
						System.out.println("Updated sucessfully..."); 
					}
				}catch(CourseNotFound e)
				     {
					System.out.println(e.getMessage());
				     }



			case 4:
				Map<String,Course> hm1=cservice.getAll();
				Set<String> s=hm1.keySet();
				s.stream().forEach(ob->System.out.println(ob+"------->"+hm1.get(ob)));
				break;


			case 5:
				System.out.println("Enter the name of the Course");
				cname=sc.next();

				boolean status3=cservice.displayByName(cname);
				if(status3) {
					System.out.println("Name displayed succesfully...");
				}else {
					System.out.println("not Found...");
				}
				break;


			case 6:

				try{System.out.println("Enter the Duration of the Course");
				int Duration1=sc.nextInt();
				List<Course>lst=cservice.FindByDuration(Duration1);
				if(lst!=null) {
					lst.forEach(System.out::println);
				}
				}catch(NoCourseDuration e) {
					System.out.println(e.getMessage());
				}
				{
					System.out.println("Not found...");
				}
				break;


			case 7:
				Map<String,Course> cmap=cservice.sortByName();
				Set<String> s1=cmap.keySet();
				s1.stream().forEach(c->System.out.println(c+"------->"+cmap.get(c)));
				break;


			case 8:
				List<Course>clst=cservice.SortedByDuration();
				clst.stream().forEach(c->System.out.println(c));
				break;


			case 9:
				System.out.println("Thank you For Visiting.............");
				sc.close();
				break;
			}

		}while(choice!=9);

	}

}
