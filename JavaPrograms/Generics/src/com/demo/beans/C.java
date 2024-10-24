package com.demo.beans;

public class C extends A{
     private int z;

	public C(int i, int j, int k) {
		super();
	}

	
	public C(int z) {
		super();
		this.z = z;
	}


	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return super.toString()+"C [z=" + z + "]";
	}
     
}
