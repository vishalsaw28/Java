package com.vishal.numberSystem;

public class SmallestAndBiggest {
	
	
	public static void main(String[] args) {
		int num = 432856;
		
//		System.out.println( findSmalelst(num));
//		System.out.println( findBiggest(num));
//
//	}
//	
//	public static int findSmalelst(int n) {
//		int min = 9;
//		while(n > 0) {
//			int digit = n%10;
//			
//			if(digit<min) {
//				min = digit;
//			}
//			
//			n= n/10;
//			
//		}
//		return min;
//		
//		
//	}
//	public static int findBiggest(int n) {
//		int max = 0;
//		while(n > 0) {
//			int digit = n%10;
//			
//			if(digit>max) {
//				max = digit;
//			}
//			
//			n= n/10;
//			
//		}
//		return max;
//		
//		
		
		
		findSmallestAndBiggest(num);
		
		
	}
	
	public static void findSmallestAndBiggest(int n) {
		int min = n%10;
		int max = n%10;
		
		while(n > 0) {
			int digit = n%10;
			
			if(digit < min) {
				min = digit;
			}
			
			if(digit > max) {
				max = digit;
			}
			
			n= n/10;
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}
