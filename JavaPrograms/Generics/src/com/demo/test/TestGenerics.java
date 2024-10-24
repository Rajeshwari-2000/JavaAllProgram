package com.demo.test;

import com.demo.beans.C;
import com.demo.beans.MyClass;
import com.demo.interfaces.CompareInterface;
import com.demo.interfaces.MyAddInterface;
import com.demo.interfaces.MyInterface1;

public class TestGenerics {

	public static void main(String[] args) {
		
		MyInterface1<C> ob=(x)->{System.out.println(x);};
		
		ob.display(new C(1,2,3));
		
		MyClass<Integer> ob3=new MyClass<>(12);
		MyClass<String> ob1=new MyClass<>("Hello");
		CompareInterface<Integer> c1=(a,b)->{
		     return a>b?a:b;
		};
		CompareInterface<String> c2=(a,b)->{
		     return a.length()>b.length()?a:b;
		};
		MyAddInterface<Integer, String> f1=(s1,s2)->{
			return s1.length()+s2.length();
		};
		MyAddInterface<Integer, Integer> f2=(a,b)->{return a+b;};
		System.out.println("find max Inetegr :"+c1.findMax(12,34));
		System.out.println("find max String :"+c2.findMax("Hello","Welcome"));
		System.out.println("Addition Inetegr :"+f2.add(12,34));
		System.out.println("find max String :"+f1.add("Hello","Welcome"));

	}

}
