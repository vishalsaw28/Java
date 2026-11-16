package com.vishal.numberSystem;

public class SumOfEvenDigits {
	public static void main(String[] args) {
		int n = 2345;
		
		System.out.println(evenSum(n));	
		
	}
	
	public static int evenSum(int n) {
		
		int sum = 0;
		
		while(n != 0) {
			int digit = n%10;
			if(digit%2 == 0) {
				sum = sum + digit;
			}
			n = n/10;
		}
		return sum;
		
	}

}
