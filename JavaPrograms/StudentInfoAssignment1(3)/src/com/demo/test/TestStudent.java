package com.demo.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;

public class TestStudent {

	public static void main(String[] args) {
		StudentService ss=new StudentService();
		
		 
		Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add New Student\n2. DisplayAll\n3. Search Student by ID\n4. Search Student by Name\n5. Calculate GPA\n6.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

         switch (choice) {
         case 1:
        	 ss.AddNewStudents();
        	 break;
        	 
        	 
             case 2:
                 ss.displayStudents();
                 break;
                 
             case 3:
                 System.out.print("Enter Student ID to search: ");
                 int studentid = sc.nextInt();
                 ss.searchById(studentid);
                 break;
                 
             case 4:
                 System.out.print("Enter Student Name to search: ");
                 String name = sc.nextLine();
                 ss.searchByname(name);
                 break;
                 
             case 5:
                 System.out.print("Enter Student ID to calculate GPA: ");
                 int studentid1= sc.nextInt();
                 ss.searchById(studentid1); 
                 break;
                 
             case 6:
                 System.out.println("Exiting the program.");
                 sc.close();
                 return;
                 
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
         
	}while(choice!=6);

}

	
	
}
