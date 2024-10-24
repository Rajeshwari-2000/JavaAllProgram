package com.demo.test;

import com.demo.enums.Coffee;

public class TestCoffeeEnum {
public static void main(String[] args) {
	Coffee c=Coffee.small;
	System.out.println("Display menu");
	switch(c) {
	case small:
		System.out.println("Small Selected..");
		break;
		
	case medium:
		System.out.println("medium Selected..");
		break;
		
	case big:
		System.out.println("big Selected..");
		break;
	}
}
}
