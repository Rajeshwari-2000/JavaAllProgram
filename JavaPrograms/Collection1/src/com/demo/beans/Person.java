package com.demo.beans;
import java.time.LocalDate;

public class Person implements Comparable<Person>{
	private int pid;
	private String pname;
	private String address;
	private LocalDate bdate;
	public Person() {
		super();
		
	}
	
	public Person(int pid) {
		super();
		this.pid = pid;
	}

	public Person(int pid, String pname, String address, LocalDate bdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
		this.bdate = bdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBdate() {
		return bdate;
	}
	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}
		
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		System.out.println("in equals of Person : "+this.pid+"----"+other.pid);
		return this.pid==other.pid;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address + ", bdate=" + bdate + "]";
	
	}

	@Override
	public int compareTo(Person o) {
		System.out.println("in compareTo person: "+this.pid+"-----"+o.pid);
		if(this.pid<o.pid)
			   return -1;
		else if(this.pid==o.pid)
			return 0;
		else 
			return 1;
		
					  
	}
	
	

}
