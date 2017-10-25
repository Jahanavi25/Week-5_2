package com.jits.bank.proxy;

import com.jits.bank.Bank;
import com.jits.bank.BankService;
import com.jits.bank.service.BankServiceImpl;

public class BankServiceProxy implements BankService{

	BankServiceImpl bankServiceImpl = null;
	@Override
	public void deposit(double amount) {
		if(bankServiceImpl==null)
		{
			System.out.println("Instantiating bankServiceImpl object");
			bankServiceImpl = new BankServiceImpl();
		}
		bankServiceImpl.deposit(amount);
	}

	@Override
	public void withdrawal(double amount) {
		if(bankServiceImpl==null)
		{
			System.out.println("Instantiating bankServiceImpl object");
			bankServiceImpl = new BankServiceImpl();
		}
		bankServiceImpl.withdrawal(amount);
	}

	@Override
	public double balanceQuery() {
		if(bankServiceImpl==null)
		{
			System.out.println("Instantiating bankServiceImpl object");
			bankServiceImpl = new BankServiceImpl();
		}
		return bankServiceImpl.balanceQuery();
	}

	@Override
	public String validateAccess(Bank bank) {
		if(bankServiceImpl==null)
		{
			System.out.println("Instantiating bankServiceImpl object");
			bankServiceImpl = new BankServiceImpl();
		}
		return bankServiceImpl.validateAccess(bank);
	}

	@Override
	public String validateAccount(String username, Integer pin) {
		if(bankServiceImpl==null)
		{
			System.out.println("Instantiating bankServiceImpl object");
			bankServiceImpl = new BankServiceImpl();
		}
		return bankServiceImpl.validateAccount(username, pin);
	}

}
