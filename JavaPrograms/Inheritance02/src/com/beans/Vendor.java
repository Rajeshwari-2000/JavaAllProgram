package com.beans;

public class Vendor extends Person{
private int  NumberOfEmp;
private float Amt;
public Vendor() {
	super();
	// TODO Auto-generated constructor stub
}
public Vendor(int numberOfEmp, float amt) {
	super();
	NumberOfEmp = numberOfEmp;
	Amt = amt;
}
public int getNumberOfEmp() {
	return NumberOfEmp;
}
public void setNumberOfEmp(int numberOfEmp) {
	NumberOfEmp = numberOfEmp;
}
public float getAmt() {
	return Amt;
}
public void setAmt(float amt) {
	Amt = amt;
}
@Override
public String toString() {
	return "Vendor [NumberOfEmp=" + NumberOfEmp + ", Amt=" + Amt + "]";
}

}
