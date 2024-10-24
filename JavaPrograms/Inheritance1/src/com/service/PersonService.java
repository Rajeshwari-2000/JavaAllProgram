package com.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.beans.Faculty;
import com.beans.GraduateStudent;
import com.beans.MasterStudent;
import com.beans.Student;

public class PersonService {
    static Student[] sarr;
    static Faculty[] facultyArr; 
    static int cnt;
    static int facultyCnt;

    static {
        sarr = new Student[100];
        facultyArr = new Faculty[100]; 

        
        sarr[0] = new GraduateStudent(12, "Manjiri", "Pune", LocalDate.of(2000, 1, 3), new int[]{88, 87}, 89);
        sarr[1] = new GraduateStudent(13, "Mugdha", "Pune", LocalDate.of(1999, 2, 13), new int[]{78, 75}, 77);
        sarr[2] = new MasterStudent(14, "Sahil", "Mumbai", LocalDate.of(2002, 1, 3), new int[]{88, 87}, "accounts", "BCOM", 89);
        cnt = 3;
        facultyCnt = 0; 
    }

    public static void addNewData(int ch) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        System.out.println("Enter name:");
        String nm = sc.next();
        System.out.println("Enter address:");
        String addr = sc.next();
        System.out.println("Enter birth date (dd/MM/yyyy):");
        String dt = sc.next();
        LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        int[] mks = new int[2];
        System.out.println("Enter marks1:");
        mks[0] = sc.nextInt();
        System.out.println("Enter marks2:");
        mks[1] = sc.nextInt();

        if (ch == 1) {
            System.out.println("Enter special subject marks:");
            int smarks = sc.nextInt();
            sarr[cnt++] = new GraduateStudent(id, nm, addr, ldt, mks, smarks);
        } else if (ch == 2) {
            System.out.println("Enter thesis subject:");
            String tsub = sc.next();
            System.out.println("Enter thesis subject marks:");
            int tmarks = sc.nextInt();
            System.out.println("Enter graduation degree:");
            String deg = sc.next();
            sarr[cnt++] = new MasterStudent(id, nm, addr, ldt, mks, tsub, deg, tmarks);
        }

       
        
    }

    
    public static void addFaculty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter skill:");
        String skill = sc.next();
        System.out.println("Enter special subject:");
        String specialSub = sc.next();
        System.out.println("Enter salary:");
        float salary = sc.nextFloat();

        facultyArr[facultyCnt++] = new Faculty(cnt, skill, specialSub, null, specialSub, specialSub, salary);

       
    }
    public static boolean deleteStudent(int id) {
        for (int i = 0; i < cnt; i++) {
            if (sarr[i] != null && sarr[i].getPid() == id) {
              
                for (int j = i; j < cnt - 1; j++) {
                    sarr[j] = sarr[j + 1];
                }
                sarr[--cnt] = null; 
                return true; 
            }
        }
        return false; 
    }

    public static boolean updateMarks(int id, int[] newMarks) {
        for (Student s : sarr) {
            if (s != null && s.getPid() == id) {
                s.setMarks(newMarks); 
                return true; 
            }
        }
        return false; 
    }

    public static Student[] displayAll() {
        return sarr;
    }

    public static Faculty[] displayAllFaculties() {
        return facultyArr;
    }

    public static float findGrade(int id) {
        for (Student s : sarr) {
            if (s != null && s.getPid() == id) {
                return s.calculateGrade();
            }
        }
        return -1;
        
    }
    
    
    
}
