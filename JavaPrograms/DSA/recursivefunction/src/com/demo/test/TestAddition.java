package com.demo.test;

import javax.print.attribute.SetOfIntegerSyntax;

public class TestAddition {
	public static void main(String[] args) {
		int ans=addition(6);
		System.out.println("Addition:"+ans);
		ans=additionrecurssive(6);
		System.out.println("AdditionRecurssion:"+ans);
	}

	private static int additionrecurssive(int num) {
		
		if(num==1)
		return 1;
		return num+additionrecurssive(num-1);
	}

	private static int addition(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}

}
