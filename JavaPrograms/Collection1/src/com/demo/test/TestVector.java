package com.demo.test;

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector(20,10);

		System.out.println("Capacity : "+v.capacity());
		v.add(12);
		v.add(10);
		v.add(20);
		v.add(12);
		System.out.println(v);

		System.out.println("Size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(i+20);
		}
		System.out.println(v);

		System.out.println("Size : "+v.size());
		System.out.println("Capacity : "+v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i+20);
		}
		System.out.println(v);

		System.out.println("Size : "+v.size());
		System.out.println("Capacity : "+v.capacity());
		v.remove(new Integer(12));
		System.out.println(v);

		System.out.println("Size : "+v.size());

	}
}
