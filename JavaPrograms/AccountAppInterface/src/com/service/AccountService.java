package com.service;

import com.beans.Account;


public interface AccountService {

	 void addnewAccount();

	Account[] findAll();

	double findBalance(int id, int pin);

	int depositAmount(int id, int pin, double amt);

	int withdrawAmount(int id, int pin, double amt);

	int deleteById(int id, int pin);
}
