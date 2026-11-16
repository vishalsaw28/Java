package com.vishal.numberSystem;

public class Disarium {
	public static void main(String[] args) {
		int n = 135;
		
		isDisarium(n);
	}
	
	public static boolean isDisarium(int n) {
		int sum =0;
		int count = countDigits(n);
		while(n >0) {
			int digit = n%10;
			sum = sum + power(digit, count);
			n = n/10;
			
		}
		if()
	}
	
	public static int countDigits(int n) {
		int count = 0;
		while(n > 0) {
			int digit =  n%10;
			count++;
			n = n/10;
		}
		return count;
	}
	
	public static int power(int n, int p) {
		int pow = 1;
		for(int i =1; i <=p; i++) {
			pow = pow *n;
			
		}
		return pow;
	}

}
