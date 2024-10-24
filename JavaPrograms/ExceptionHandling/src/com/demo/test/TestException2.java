package com.demo.test;

import java.util.Scanner;

import com.demo.exception.ArrayIndexOutOfBoundException;
import com.demo.exception.InputMissmatchException;

public class TestException2 {
	public static void main(String[] args) throws InputMissmatchException, ArrayIndexOutOfBoundException {
		Scanner sc=new Scanner(System.in);
				for(int i=0;i<3;i++) {
					try {
						System.out.println("Enter number1");
						int num=sc.nextInt();
						System.out.println("Enter number2");
						int num1=sc.nextInt();
						int ans=num+num1;
						System.out.println("Answer:"+ans);
						ans=num/num1;
						System.out.println("Division:"+ans);
						String s=null;
						System.out.println(s.length());
						break;
					}catch(ArithmeticException e) {
						System.out.println("cannot divide by zero");
						System.out.println("e.getMessege()");
					}catch(Exception e) {
						System.out.println("error occured");
						System.out.println(e.getMessage());
					}finally {
						System.out.println("In finally block");
						sc.close();
					}
				}
				System.out.println("resume the execution of remaining program");
		
	}

}
