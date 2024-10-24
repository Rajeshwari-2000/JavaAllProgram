package com.demo.beans;

public class B extends A{
	 private int y;

	public B() {
		super();
	}

	public B(int y) {
		super();
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

}
