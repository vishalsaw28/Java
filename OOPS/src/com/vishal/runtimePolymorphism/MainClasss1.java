package com.vishal.runtimePolymorphism;

public class MainClasss1 {
	
	public static void main(String[] args) {
		DebitCard dc = new DebitCard();
		
		Shop.payment(dc);
		
		CreditCard cc = new CreditCard();
		Shop.payment(cc);
	}

}
