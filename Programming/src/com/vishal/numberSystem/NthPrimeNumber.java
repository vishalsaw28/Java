package com.vishal.numberSystem;

public class NthPrimeNumber {
	public static void main(String[] args) {
		
		
		int target = 10;
		int current = 2;
		int temp = 0;
		
		while(temp < target) {
			if(primeNumbers(current)) {
				
				temp++;
			}
			if(temp == target) {
				
			System.out.println(current);
			}
			
			current++;
		}
		
		}
		
		public static boolean primeNumbers(int n) {
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
