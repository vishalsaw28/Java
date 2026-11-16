package com.vishal.BeanClass;

public class MainClass2 {
	
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccountNumber(34353242);
		a1.setAccountBalance(3000.00);
		
		System.out.println( "Account Number: "+a1.getAccountNUmber());
		System.out.println("Account Balance: "+a1.getAccountBalance());
		
		
	}

}
