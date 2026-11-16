package com.vishal.runtimePolymorphism;

public class Shop {
	
	static void payment(Card c) {
		if(c != null) {
		     c.swipe();
		}
	}

}
