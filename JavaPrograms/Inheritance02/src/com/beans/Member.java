package com.beans;

public class Member extends Person{
private String TypeOfMembership;
private float AmtPaid;
public Member() {
	super();
	
}
public Member(String typeOfMembership, float amtPaid) {
	super();
	TypeOfMembership = typeOfMembership;
	AmtPaid = amtPaid;
}
public String getTypeOfMembership() {
	return TypeOfMembership;
}
public void setTypeOfMembership(String typeOfMembership) {
	TypeOfMembership = typeOfMembership;
}
public float getAmtPaid() {
	return AmtPaid;
}
public void setAmtPaid(float amtPaid) {
	AmtPaid = amtPaid;
}
@Override
public String toString() {
	return "Member [TypeOfMembership=" + TypeOfMembership + ", AmtPaid=" + AmtPaid + "]";
}

}
