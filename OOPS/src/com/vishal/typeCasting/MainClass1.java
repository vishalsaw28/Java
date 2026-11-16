package com.vishal.typeCasting;

public class MainClass1 {
public static void main(String[] args) {
	double b =  4.5;
	
	int a = (int)b;// NARROWING: double --> inte
	System.out.println(a);
	
	int k = 97;
	char c= (char)k;
	System.out.println(c);
	
	long p = 2983672868658897462L;
	
	int q = (int)p;
	
   System.out.println(q);
	
	
	
	
}
}
