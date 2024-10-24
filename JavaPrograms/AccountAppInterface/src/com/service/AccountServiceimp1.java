package com.service;

import java.util.Scanner;

import com.beans.Account;

public class AccountServiceimp1 implements AccountService {
	static Account[] accarr;
	static int cnt;
	static {
		accarr=new Account[100];
		accarr[0]=new Account(1,"Rajan",56865,1010);
		accarr[1]=new Account(2,"Atharva",96688,2121);
		cnt=2;
	}

	public void addnewAccount() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter account id");
		int accId=sc.nextInt();

		System.out.println("Enter the account holder name");
		String name=sc.next();

		System.out.println("Enter the account balance");
		double accBal=sc.nextDouble();

		System.out.println("Enter the account pin");
		int pin=sc.nextInt();

		accarr[cnt]=new Account(accId,name,accBal,pin);

	}

	public Account[] findAll() {
		return accarr;
	}

	public int deleteById(int accId, int pin) {
		int pos=FindAccountById(accId,pin);
		if(pos>=0) {
			for(int i=pos;i<cnt;i++) {
				accarr[i]=accarr[i+1];
			}
		}
		return pos;
	}


	public int withdrawAmount(int accId, int pin, double amt) {
		int pos=FindAccountById(accId,pin);
		if(pos>=0) {
			boolean status= accarr[pos].withdraw(amt);
			if(status) {
				return 1;
			}else {
				return -3;
			}
		}
		return pos;
	}




	public int depositAmount(int accId, int pin, double amt) {

		int pos=FindAccountById(accId, pin);
		if(pos>=0) {
			accarr[pos].deposit(amt);

		}
		return pos;
	}
	public double findBalance(int id, int pin) {
		int pos=FindAccountById(id,pin);
		if(pos>=0) {
			return accarr[pos].getAccBal();
		}
		return pos;
	}

	private int FindAccountById(int accId, int pin) {
		for(int i=0;i<accarr.length;i++)
		{
			if(accarr[i].getAccId()==accId) {
				if(accarr[i].getPin()==pin) {
					return i;

				}else {
					return  -2;
				}
			}
		}
		return -1;
	}







}
