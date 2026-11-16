package com.jspider.module2;

import java.util.Scanner;

public class Bank {
	
	static void showAccountDetails(Account a) {
		if(a != null) {
			System.out.println("Account Number is:"+a.accountNumber);
			System.out.println("Account Balance is:"+a.accountBalance);
		}
	}
	
	
	static Account createAccount() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number:");
		
		long accNo = sc.nextLong();
		
		System.out.println("Enter bank Banalce:");
		double accBal = sc.nextDouble();
		
		Account a = new Account(accNo, accBal);
		return a;
		
	}


	

}
