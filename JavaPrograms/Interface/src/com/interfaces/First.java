package com.interfaces;

public interface First {
	
		void m1();
		int m2(int x);
		
		private int factorial(int n) {
			int f=1;
			for(int i=2;i<n;i++) {
				f=f*i;
			}
			return f;	
		}
		
		default int permutation(int n,int r){
			System.out.println("in permutation method method");
			int x=factorial(n)/factorial(n-r);
			return x;
		}
		
		default int combination(int n,int r){
			System.out.println("in combination method");
			int x=factorial(n)/(factorial(n-r)*factorial(r));
			return x;
		}
		
	    public static void  m2() {
	    	System.out.println("in static method");
	    } 
	}


