package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.service.AccountServiceImpl;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class TestAccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountServiceImpl acservice=new AccountServiceImpl();
		LoginService lservice=new LoginServiceImpl();
		System.out.println("enter username");
		String uname=sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		String role=lservice.autheticate(uname,pass);
		int choice=0;

		do {
			System.out.println("1.Open new account\n2. withdraw amt\n3. deposit amount\n4. transfer funds \n5.change pin\n6. check balance\n7. close account\n8. display all\n9.admin panel\nchoice");

			choice=sc.nextInt();
			switch(choice) {

			case 1:
				System.out.println("1.Saving\n2.Current\n choice: ");
				int ch=sc.nextInt();
				boolean status=acservice.addnewAccount(ch);
				if(status) {
					System.out.println("Account opening done");
				}else{
					System.out.println("error occured");
				}
				break;


			case 2:
				System.out.println("Enter acid");
				String acid=sc.next();
				System.out.println("Enter pin");
				int pin=sc.nextInt();
				System.out.println("Enter amt to withdraw");
				double amt=sc.nextDouble();
				int ans=acservice.withdrawAmount(acid,pin,amt);
				if(ans==1) {
					System.out.println("Withdrawal done");
				}else if(ans==2) {
					System.out.println("Insuffitient balance");   
				}else {
					System.out.println("Wrong credentials");
				}
				break;


			case 3:
				System.out.println("enter acid");
				String acid1=sc.next();
				System.out.println("enetr pin");
				int pin1=sc.nextInt();
				System.out.println("enter amt to deposit");
				double amt1=sc.nextDouble();
				boolean status1=acservice.depositAmount(acid1,pin1,amt1);
				if(status1) {
					System.out.println("deposit done");
				}else {
					System.out.println("wrong credentials");
				}
				break;


			case 4:
				System.out.println("enter acid of source account");
				String acid11=sc.next();
				System.out.println("enter acid of destination account");
				String dacid=sc.next();
				System.out.println("enetr pin");
				int pin11=sc.nextInt();
				System.out.println("enter amt to transfered");
				double amt11=sc.nextDouble();
				boolean status11=acservice.transferfunds(acid11,dacid,pin11,amt11);
				if(status11) {
					System.out.println("transfer done");
				}else {
					System.out.println("transfer failed");
				}
				break;


			case 5:
				System.out.println("enter acid to change the pin");
				String acid2=sc.next();
				System.out.println("do you want to enter old pin");
				String ans1=sc.next();
				if(ans1.equals("y")) {
					System.out.println("enetr pin");
					int pin2=sc.nextInt();
				}else {
					boolean status2=acservice.modifypinnum(acid2); 
					if(status2) {
						System.out.println("pin changed");
					}else {
						System.out.println("cannot change pin, wrong credentials"); 
					}
				}
				break;


			case 6:
				System.out.println("Enter account ID:");
				String balanceAcid = sc.next();
				System.out.println("Enter PIN:");
				int balancePin = sc.nextInt();
				double balance = acservice.checkBalance(balanceAcid, balancePin);
				if (balance >= 0) {
					System.out.println("Your current balance is: " + balance);
				} else {
					System.out.println("Wrong credentials or account not found.");
				}
				break;


			case 7:
				System.out.println("enter acid");
				String acid3=sc.next();
				System.out.println("enetr pin");
				int pin13=sc.nextInt();
				boolean status3=acservice.removeAccountById(acid3,pin13);
				if(status3) {
					System.out.println("account is closed, balance is given to user");
				}else {
					System.out.println("error in account closing");
				}
				break;


			case 8:
				Set<Account> sac=acservice.getAll();
				sac.stream().forEach(System.out::println);
				break;


			case 9:
				System.out.println("Admin panel...");
				break;


			default:System.out.println("wrong choice");
			break;

			}
		}while(choice!=9);
		{
			int choice1=0;
			do {
				System.out.println("1. Display All account\n2. display in sorted order by id\n3. display in sorted order by name\n4. exit\n choice: \n");

				choice1=sc.nextInt();
				switch(choice1) {
				case 1:
					Set<Account> aset=acservice.getAll();
					aset.stream().forEach(System.out::println);
					break;


				case 2:
					Set<Account> aset1=acservice.sortById();
					aset1.stream().forEach(System.out::println);
					break;


				case 3:
					List<Account> aset2=acservice.sortByName();
					aset2.stream().forEach(System.out::println);
					break;


				case 4:System.out.println("thank you for visiting.....");
				break;


				default:System.out.println("wrong choice");
				break;


				}
			}while(choice1!=4);
			
			sc.close();
		}
	}
}


