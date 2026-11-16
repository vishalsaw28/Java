package com.jspider.module2;

import java.util.Scanner;

public class BiriyaniHotel {
	
	static void showOrderDetails(Biriyani b) {
		if(b != null) {
			System.out.println("Quantity: "+b.qty);
			System.out.println("Price: "+ b.price);
		}
	}
	
	static Biriyani createOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity");
		int qty = sc.nextInt();
		
		
		int price = qty*200;
		
//		System.out.println("Price is: "+ price);
		
		Biriyani b = new Biriyani(qty, price);
		return b;
		
	}

}
