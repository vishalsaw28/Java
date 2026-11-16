package com.vishal.numberSystem;

public class sumOfDigits {
	
	public static void main(String[] args) {
		int n = 345;
		
		System.out.println(sumOfDigit(n));
		
		
	}
	
	public static int sumOfDigit(int n ) {
		int sum = 0;
		
		while(n > 0 ) {
			sum = sum  + n%10;
			n = n/10;
		}
		
		return sum;
	}

}
