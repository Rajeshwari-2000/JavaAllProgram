package com.beans;

import com.interfaces.First;
import com.interfaces.Second;

public class MyClass implements First,Second{

		@Override
		public void m3() {
			System.out.println("in m3 myclass");	
		}

		@Override
		public void m1() {
			System.out.println("in m1 myclass");
			
		}

		@Override
		public int m2(int x) {
			System.out.println("in m2 myclass");
			return x*10;
	}
}
