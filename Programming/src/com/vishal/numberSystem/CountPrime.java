package com.vishal.numberSystem;

public class CountPrime {
	
	public static void main(String[] args) {
		int n = 2345;
		
		System.out.println(primeCount(n));
	}
	
	public static int primeCount(int n) {
		
		int count = 0;
		
		while(n != 0) {
			int digit = n%10;
			
			
			// This is not the good approh.
			
//			if(digit <= 1) {
//				return count;
//			}
//			
//			for(int i =2; i<= digit/2; i++ ) {
//				if(digit%i == 0 ) {
//					count = 0;
//				}
//			}
//			
//		    count++;	
//			n = n/10;
			
			if(digit == 2 || digit == 3 || digit == 5 || digit == 7) {
				count++;
			}
			n = n/10;	
		}
		return count;
		
	}

}
