package com.test;

import java.util.Scanner;
import com.beans.GraduateStudent;
import com.beans.MasterStudent;
import com.beans.Student;
import com.service.PersonService;

public class PersonArrayTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Accept new data\n2. Delete student\n3. Update marks");
            System.out.println("4. Display all Graduate Students\n5. Display all Master Students\n6. Find Grade");
            System.out.println("7. Display all Students\n8. Exit\nChoice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. GraduateStudent \n2. MasterStudent\n3. Faculty\nChoice:");
                    int ch = sc.nextInt();
                    PersonService.addNewData(ch);
                    break;
                case 2:
                    System.out.println("Enter student ID to delete:");
                    int deleteId = sc.nextInt();
                    if (PersonService.deleteStudent(deleteId)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter student ID to update marks:");
                    int updateId = sc.nextInt();
                    int[] newMarks = new int[2];
                    System.out.println("Enter new marks1:");
                    newMarks[0] = sc.nextInt();
                    System.out.println("Enter new marks2:");
                    newMarks[1] = sc.nextInt();
                    if (PersonService.updateMarks(updateId, newMarks)) {
                        System.out.println("Marks updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    displayStudentsByType(GraduateStudent.class);
                    break;
                case 5:
                    displayStudentsByType(MasterStudent.class);
                    break;
                case 6:
                    System.out.println("Enter student ID:");
                    int id = sc.nextInt();
                    float marks = PersonService.findGrade(id);
                    if (marks > 0) {
                        System.out.println("Marks: " + marks);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 7:
                    displayAllStudents();
                    break;
                case 8:
                    System.out.println("Thank you for visiting...");
                    sc.close();
                    break;
                default:
                    System.out.println("Wrong choice. Please try again.");
                    break;
            }
        } while (choice != 8);
    }

    private static void displayStudentsByType(Class<? extends Student> studentType) {
        Student[] sarr = PersonService.displayAll();
        for (Student s : sarr) {
            if (s != null && studentType.isInstance(s)) {
                System.out.println(s);
            }
        }
    }

    private static void displayAllStudents() {
        Student[] sarr = PersonService.displayAll();
        for (Student s : sarr) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
