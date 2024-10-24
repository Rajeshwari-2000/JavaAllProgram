package com.demo.beans;

public class Course implements Comparable<Course> {
	private String cname;
	private double fees;
	private int Capacity;
	private int Duration;

	public Course() {
		super();
	}

	public Course(String cname, double fees, int capacity, int duration) {
		super();
		this.cname = cname;
		this.fees = fees;
		Capacity = capacity;
		Duration = duration;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	@Override
	public String toString() {
		return "Course [cname=" + cname + ", fees=" + fees + ", Capacity=" + Capacity + ", Duration=" + Duration + "]";
	}

	@Override
	public int compareTo(Course o) {
		System.out.println("in compareTo method of Course "+this.cname+"-----"+o.cname);
		return this.Duration-o.Duration;
	}

}
