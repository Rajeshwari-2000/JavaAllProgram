package com.beans;

public class Person {
private int Pid;
private String Pname;
private String MobNo;
private String Email;
public Person() {
	super();
}
public Person(int pid, String pname, String mobNo, String email) {
	super();
	Pid = pid;
	Pname = pname;
	MobNo = mobNo;
	Email = email;
}
public int getPid() {
	return Pid;
}
public void setPid(int pid) {
	Pid = pid;
}
public String getPname() {
	return Pname;
}
public void setPname(String pname) {
	Pname = pname;
}
public String getMobNo() {
	return MobNo;
}
public void setMobNo(String mobNo) {
	MobNo = mobNo;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
@Override
public String toString() {
	return "Person [Pid=" + Pid + ", Pname=" + Pname + ", MobNo=" + MobNo + ", Email=" + Email + "]";
}

}
