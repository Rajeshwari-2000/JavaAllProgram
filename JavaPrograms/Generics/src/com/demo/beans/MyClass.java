package com.demo.beans;

public class MyClass<T> {
	private T nm;

	public MyClass() {
		super();
	}

	public MyClass(T nm) {
		super();
		this.nm = nm;
	}

	public T getNm() {
		return nm;
	}

	public void setNm(T nm) {
		this.nm = nm;
	}

	@Override
	public String toString() {
		return "MyClass [nm=" + nm + "]";
	}
	

}
