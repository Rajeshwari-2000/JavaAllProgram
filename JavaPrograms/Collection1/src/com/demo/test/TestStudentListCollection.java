package com.demo.test;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;
public class TestStudentListCollection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService sservice=new StudentServiceImpl();
		int choice=0;
		do {
			System.out.println("1.Add new student\n2.Delete student by id\n3.Modify marks\n4.Search by id");
			System.out.println("5.Search by marks > Given marks\n6.Sort by id\n7.Sort by name\n8.Sort by marks");
			System.out.println("9.Display all\n10.Search by name and display in sorted order\n11.Exit\nchoice:");
			choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("1.MasterStudent\n2.GraduateStudent\n3.faculty\nchoice:");
				int ch=sc.nextInt();
				sservice.addnewStudent(ch);
				break;


			case 2:
				System.out.println("Enter id for delete");
				int id=sc.nextInt();
				boolean status=sservice.deleteById(id);
				if(status) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("not found");
				}
				break;

			case 3:
				System.out.println("Enter id for delete");
				id=sc.nextInt();
				System.out.println("enter marks to modify");
				int newmarks=sc.nextInt();
				boolean status1=sservice.modifyStudentMarks(id,newmarks);
				if(status1) {
					System.out.println("updation done successfully");
				}else {
					System.out.println("not found");
				}
				break;

			case 4:
				System.out.println("Enter id");
				id=sc.nextInt();
				Student s=sservice.getById(id);
				if(s!=null) {
					System.out.println(s);
				}else {
					System.out.println("not found");
				}
				break;

			case 5:
				System.out.println("Enter marks for searching");
				int mks=sc.nextInt();
				List<Student> lst=sservice.getByMarks(mks);
				if(lst!=null) {
					lst.stream().forEach(ob->System.out.println(ob));
				}else {
					System.out.println("Not found");
				}
				break;

			case 6:
				List<Student> lst1=sservice.sortById();
				lst1.stream().forEach(System.out::println);
				break;

			case 7:
				List<Student> lst11=sservice.sortByName();
				lst11.stream().forEach(System.out::println);
				break;

			case 8:
				List<Student> lst2=sservice.sortByMarks();
				lst2.stream().forEach(System.out::println);
				break;

			case 9:
				List<Student> slst=sservice.getAllStudents();
				slst.stream().forEach(System.out::println);
				break;

			case 10:
				System.out.println("Enter name");
				String nm=sc.next();
				List<Student> lst3=sservice.getByName(nm);
				if(lst3!=null) {
					lst3.stream().forEach(ob->System.out.println(ob));
				}else {
					System.out.println("Not found");
				}
				break;

			case 11:
			default:System.out.println("Wrong choice");
			break;

			}
		}while(choice!=11);
	}
}