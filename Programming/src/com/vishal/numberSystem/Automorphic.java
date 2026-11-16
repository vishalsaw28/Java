package com.vishal.numberSystem;

public class Automorphic {
	public static void main(String[] args) {
		int n = 4;
		if(isAutomorphic(n)) {
			System.out.println(true);
		}
		else {
			
		System.out.println(false);
		}
	}
	
	public static boolean isAutomorphic(int n) {
		
			int square = n * n;
			
			int squarelastDigit = square%10;
			
			if(squarelastDigit == n) {
				return true;
			}
			else {
				
				return false;
			}
		
	}

}
