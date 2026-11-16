package com.vishal.numberSystem;

public class SumOfPalindrome {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1 ; i <= 500; i++ ) {
			if(isPalindrome(i)) {
//				System.out.println(i);
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPalindrome(int n) {
		int rev = 0, org = n;
		while(n > 0) {
			int digit = n%10;
			rev = rev*10+digit;
			n = n/10;
		}
		if(rev == org)
		{
			return true;
		}
		else {
			return false;
	}
		
	}
}
