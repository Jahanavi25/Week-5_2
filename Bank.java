package com.jits.bank;

public class Bank {

	int bankId;
	int routingNbr;
	public Bank(int bankId, int routingNbr) {
		super();
		this.bankId = bankId;
		this.routingNbr = routingNbr;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public int getRoutingNbr() {
		return routingNbr;
	}
	public void setRoutingNbr(int routingNbr) {
		this.routingNbr = routingNbr;
	}
	
}
