package com.vishal.numberSystem;

public class PrintPrime {
	public static void main(String[] args) {
		int n = 100;
//		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(isPrime(i) == true) {
//				count++;
				
				System.out.println(i);
			}
		}
//		System.out.println(count);
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		
		boolean isPrime = true;
		
		for(int i = 2; i <= n/2; i++) {
			if(n%i==0) {
				isPrime = false;
			}
			
		}
		return isPrime;
	}

}
