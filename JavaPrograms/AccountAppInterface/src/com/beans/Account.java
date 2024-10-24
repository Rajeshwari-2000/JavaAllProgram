package com.beans;

public class Account {
	private int accId;
	private String accName;
	private double accBal;
	private int pin;
	public Account() {
		super();
	}
	public Account(int accId, String accName, double accBal, int pin) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.accBal = accBal;
		this.pin = pin;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + ", accBal=" + accBal + ", pin=" + pin + "]";
	}

	public void deposit(double amt) {
		this.accBal=this.accBal+amt;
	}

	public boolean withdraw(double amt) {
		if(accBal-amt>=10000) {
			this.accBal=this.accBal-amt;
			return true;
		}else {
			return false;
		}
	}
	
}
