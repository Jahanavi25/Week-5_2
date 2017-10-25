package com.jits.bank;

public interface BankService {

	public void deposit(double amount);
	public void withdrawal(double amount);
	public double balanceQuery();
	
	public String validateAccess(Bank bank);
	public String validateAccount(String username,Integer pin);
	
}
