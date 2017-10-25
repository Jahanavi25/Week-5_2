package com.jits.bank.client.test;

import com.jits.bank.Bank;
import com.jits.bank.proxy.BankServiceProxy;

public class BankServiceTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank(1234,1234);
		BankServiceProxy proxy = new BankServiceProxy();
		if(proxy.validateAccess(bank).equals("Accessable"))
		{
			System.out.println("Bank Service is accessable");
			if(proxy.validateAccount("Jahnavi", 1234).equals("Authenticated"))
			{
				System.out.println("Account authentication successfully");
			}
			else
			{
				System.out.println("Account authentication failed");
			}
		}
		else
		{
			System.out.println("Bank Service is not accessable");
		}
	}

}
