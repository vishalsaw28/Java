package com.vishal.runtimePolymorphism;

public class CreditCard extends Card{
	
	@Override
	void swipe() {
		System.out.println("Due Increases.");

	}

}
