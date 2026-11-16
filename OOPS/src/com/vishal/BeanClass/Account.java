package com.vishal.BeanClass;

public class Account {
	
	private long accountNumber;
	
	private double accountBalance;

	public long getAccountNUmber() {
		// Authorization;
		
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		// Authorizzation;
		this.accountNumber = accountNumber;
	}
	
	public double getAccountBalance() {
		// Authorization;
		
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		// Authorizzation;
		this.accountBalance = accountBalance;
	}

	
	
}
