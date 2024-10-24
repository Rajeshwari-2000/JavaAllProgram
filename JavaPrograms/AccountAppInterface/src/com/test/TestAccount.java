package com.test;

import java.util.Scanner;
import java.util.Arrays;

import com.beans.Account;
import com.service.AccountServiceimp1;
import com.service.AccountService;

public class TestAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountService ac= new AccountServiceimp1();
		int choice=0;
		do {
			System.out.println("1.Add new account\n2.Delete by id\n3.Withdrawl\n4.deposite\n5.check balance\n6.Find all\n7.exit\nchoice: ");

			choice =sc.nextInt();
			switch(choice) {

			case 1:
				ac.addnewAccount();
				break;


			case 2:
				System.out.println("Enter the account id");
				int accId=sc.nextInt();

				System.out.println("Enter the account pin");
				int pin=sc.nextInt();

				int status= ac.deleteById(accId,pin);

				if(status>0) {
					System.out.println("Account  is Closed...");
				}else if(status==-1){
					System.out.println("not Found...");
				}else {
					System.out.println("pin is wrong....");
				}
				break;


			case 3:
				System.out.println("Enter the account id");
				accId=sc.nextInt();

				System.out.println("Enter the account pin");
				pin=sc.nextInt();

				System.out.println("Enter the amount to deposit");
				double amt=sc.nextDouble();

				status=ac.withdrawAmount(accId,pin,amt);

				if (status>0) {
					System.out.println("Money withdrawl Done...");
				}else if(status==-1) {
					System.out.println("not Found...");

				}else if(status==-3){
					System.out.println("insufficient balance");
				}else {
					System.out.println("pin is wrong");
				}
				break;

				
			case 4:
				System.out.println("Enter the account id");
				accId=sc.nextInt();

				System.out.println("Enter the account pin");
				pin=sc.nextInt();

				System.out.println("Enter the amount to deposite");
				amt=sc.nextDouble();

				status=ac.depositAmount(accId,pin,amt);

				if (status>0) {
					System.out.println("Money withdrawl Done...");
				}else if(status==-1) {
					System.out.println("not Found...");

				}else {
					System.out.println("pin is wrong....");
				}
				break;


			case 5:
				System.out.println("Enter the account id");
				accId=sc.nextInt();

				System.out.println("Enter the account pin");
				pin=sc.nextInt();

				double bal=ac.findBalance(accId,pin);
				if(bal>0) {
					System.out.println("Balance of account:"+accId+":"+bal);

				}else if(bal==-1) {
					System.out.println("not found...");
				}else {
					System.out.println("pin is wrong...");
				}


				break;

			case 6:
				Account[]arr=ac.findAll();
				for(Account a:arr) {
					if(a!=null)
						System.out.println(a);
					else
						break;
				}
				break;


			case 7:
				System.out.println("thank you for visiting.....");
				sc.close();
				break;


			default:
				System.out.println("Wrong choice...");
				break;
			}
		}while(choice!=7);
		sc.close();
	}

}
