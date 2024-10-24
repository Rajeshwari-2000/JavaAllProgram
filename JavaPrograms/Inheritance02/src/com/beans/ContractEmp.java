package com.beans;

public class ContractEmp extends Person{
private int NumOfHours;

public ContractEmp() {
	super();
	
}

public ContractEmp(int numOfHours) {
	super();
	NumOfHours = numOfHours;
}

public int getNumOfHours() {
	return NumOfHours;
}

public void setNumOfHours(int numOfHours) {
	NumOfHours = numOfHours;
}

@Override
public String toString() {
	return "ContractEmp [NumOfHours=" + NumOfHours + "]";
}



}
