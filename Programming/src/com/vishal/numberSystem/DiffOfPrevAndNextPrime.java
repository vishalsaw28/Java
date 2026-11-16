package com.vishal.numberSystem;

public class DiffOfPrevAndNextPrime {
	
	public static void main(String[] args) {
		
		int n = 20;
	  int next = 	next(n+1);
	 int prev =  prev(n-1);
	 System.out.println(next-prev);
		
	}
	
	private static int next(int n) {
		while(true) {
			if(isPrime(n)) {
				return n;
			}
			n++;
		}
	}
	
	private static int prev(int n) {
		
		if(n<=2) {
			return 0;
		}
		while(true) {
			
			if(isPrime(n)) {
				return n;
			}
			n--;
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
