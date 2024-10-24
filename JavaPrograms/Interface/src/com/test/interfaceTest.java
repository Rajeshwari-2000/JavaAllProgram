package com.test;

import com.beans.MyClass;
import com.interfaces.First;
import com.interfaces.Second;

public class interfaceTest {
		public static void main(String[] args) {
			MyClass ob=new MyClass();
			ob.combination(5, 2);
			First ob1=new MyClass();
			ob1.combination(4, 2);
			
			Second ob2=new MyClass();
			ob2.m3(); 
			((MyClass)ob2).m2(12);
			ob2.hashCode();		
		}
	}


