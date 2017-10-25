package com.jits.bank.service;

import com.jits.bank.Bank;
import com.jits.bank.BankService;

public class BankServiceImpl implements BankService{

	double balance = 50;
	@Override
	public void deposit(double amount) {
		balance+=amount;
	}

	@Override
	public void withdrawal(double amount) {
		balance-=amount;
	}

	@Override
	public double balanceQuery() {
		return balance;
	}

	@Override
	public String validateAccess(Bank bank) {
		if(bank.getBankId()==1234 && bank.getRoutingNbr()==1234)
		{
			return "Accessable";
		}
		else
		{
			return "NotAccessable";
		}
	}

	@Override
	public String validateAccount(String username, Integer pin) {
		if(username.equalsIgnoreCase("Jahnavi") && pin==1234)
		{
			return "Authenticated";
		}
		else
		{
			return "Unauthenticated";
		}
	}

}
