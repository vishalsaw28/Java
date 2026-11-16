package com.vishal.numberSystem;

public class productOfDigits {
	
	public static void main(String[] args) {
		int n = 345;
		
		System.out.println(productOfDigit(n));
	}
	
	public static int productOfDigit(int n ) {
		int product = 1;
		
		while(n != 0) {
			int digit = n%10;
			product = product*digit;
			n = n/10;
		}
		
		return product;
	}

}
