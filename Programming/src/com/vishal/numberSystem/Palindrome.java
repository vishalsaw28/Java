package com.vishal.numberSystem;

public class Palindrome {
	
	public static void main(String[] args) {

			
				int num = 232;
				
				checkPalindrome(num);
				
			}
			
			public static void checkPalindrome(int num) {
				int originalNum = num;
				int reversedNum = 0;
				
				while(num != 0) {
					int digit = num%10;
					reversedNum = reversedNum *10 + digit;
					
					num = num/10;	
					
				}
				
				System.out.println(reversedNum);
				
				if(originalNum == reversedNum) {
					System.out.println("it's a palindrome");
			}else {
				System.out.println("Not a palindrome.");
			}
			
			

		
	}

}
