package com.demo.beans;

public class Storage {

	private int n;
	private boolean valueset;
	public Storage() {
		super();
		valueset=false;

	}

	synchronized public void get() {
		if(!valueset) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	synchronized public void put(int x) {
		if(valueset) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("in put : "+x);
		n=x;
		valueset=true;
		notify();
	}

	public void setStopFlag(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
