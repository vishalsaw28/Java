package com.vishal.numberSystem;

public class NearestPrimeNumber {
	public static void main(String[] args) {
		
	
	int n = 10;
	
	int prev = n-1;
	int next = n+1;
	
	while(true) {
		if(isPrime(prev)) {
			System.out.println(prev);
			break;
		}
		else if(isPrime(next)) {
			System.out.println(next);
			break;
		}
		
		
		
		next++; //
		prev--;
			
	}
	}
	
	
	

	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		
		boolean isPrime = true;
		
		for(int i =2; i<=n/2; i++) {
			if(n % i ==0)
			isPrime = false;
		}
		return isPrime;
	}
	
}
