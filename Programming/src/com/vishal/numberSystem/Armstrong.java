
		package com.vishal.numberSystem;

public class Armstrong {
	
	public static void main(String[] args) {
		int n = 153;
		
		System.out.println( isArmstrong(n));
		
	}
	
	public static boolean isArmstrong(int n) {
		
		int count = countDigits(n);
		int original = n; 
		int sum = 0;
	
		while(n >0) {
			
			int digit = n%10;
			int pow = power(digit, count);
			sum = sum + pow;
			n = n/10;
			
		}
		
		if(sum == original) {
			return true;
		}
		return false;
		
		
	}
	
	private static int countDigits(int n) {
		int count = 0;
		while(n > 0) {
			int digit = n%10;
			count++;
			n = n/10;
		}
		
		
		
		return count;
	}

	public static int power(int n, int p) {
		
		int pow = 1;
		
		for(int  i = 1; i <=p; i++) {
			pow = pow*n;
		}
		
		return pow;
		
		
	}
	

}
