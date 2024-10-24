package com.demo.test;

public class TestFactorial {

	public static void main(String[] args) {
		int ans=factorial(5);
		System.out.println("factorial:"+ans);
		ans=factorialrecurssive(5);
		System.out.println("factorialrecurssive:"+ans);
	}

	private static int factorialrecurssive(int n) {
		if (n==1)
		return 1;
		return n*factorial(n-1);
	}

	private static int factorial(int num) {
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact=fact*i;
		}
		
		return fact;
	}

}
