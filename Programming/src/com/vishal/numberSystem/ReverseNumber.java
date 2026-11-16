package com.vishal.numberSystem;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int num = 234;
		
		System.out.println(reverseNum(num));
		
	}
	
	public static int reverseNum(int num) {
		int reversedNum = 0;
		
		while(num != 0) {
			int digit = num%10;
			reversedNum = reversedNum *10 + digit;
			
			num = num/10;
			
			
			
		}
		return reversedNum;
		
	}
	
	

}
