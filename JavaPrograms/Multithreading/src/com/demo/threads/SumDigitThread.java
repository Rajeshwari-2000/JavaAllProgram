package com.demo.threads;

import com.demo.beans.MyClass;

public class SumDigitThread implements Runnable {
	private MyClass ob;
	private int num;
	public SumDigitThread(MyClass ob,int num) {
		super();
		this.ob=ob;
		this.num=num;
	}
	@Override
	public void run() {
	int ans=ob.sumdigits(num);
	System.out.println("SumDigits:"+ans);
		
	}
	
}