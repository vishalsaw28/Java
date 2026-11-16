package com.vishal.numberSystem;

public class CountStrongNumbers {
	
	public static void main(String[] args) {
		int count = 0;
		
		for(int i =1; i<=1000; i++) {
			if(isStrong(i)) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	public static boolean isStrong(int n) {
		int sum = 0, original = n;
		while(n > 0) {
			int digit = n%10;
			sum = sum + factorial(digit);
			n = n/10;
		}
		
		if(sum==original) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int factorial(int n) {
//		int fact = 1;
//		for(int i =1; i<=n; i++) {
//			fact = fact*i;
//		}
//		return fact;
		
		if(n == 0 || n == 1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}

}
