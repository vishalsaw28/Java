package com.vishal.numberSystem;

public class Strong {
	
	public static void main(String[] args) {

			
				int num = 145;
				
				checkPalindrome(num);
				
			}
			
			public static void checkPalindrome(int num) {
				int originalNum = num;
				int sum = 0;
				
				while(num != 0) {
					int digit = num%10;
					sum = sum +factorial(digit);
					
					num = num/10;	
					
				}
				
				System.out.println(sum);
				
				if(originalNum == sum) {
					System.out.println("it's a Strong number");
			}else {
				System.out.println("Not a Strong number.");
			}
			
			

		
	}
			
			public static int factorial(int num) {
				int fact = 1;
				
//				for(int i =1; i<= num; i++) {
//					fact = fact*i;
//				}
				return fact * factorial(num-1);
			}

}
