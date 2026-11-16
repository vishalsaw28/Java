package com.vishal.numberSystem;

public class NtothePowerP {
	public static void main(String[] args) {
		int n  =2;
		int p = 3;
		
		System.out.println(nToPowerP(n, p));
	}
	
	public static int nToPowerP(int n , int p) {
//		int pow = 1;
//		for(int i =1; i<=p; i++) {
//			pow  = pow*i;
//		}
//		return pow;
		
		if(p==0) {
			return 1;
			
		}
		
		return n*nToPowerP(n,p-1);
	}

}
