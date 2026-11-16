package com.vishal.accessModifier;

public class Fire {
	
	private static int  a= 10;
	static int b = 20;
	protected static int c = 30;
	public static int d = 40;
	
	public static void main(String[] args) {
		System.out.println(Fire.a);
	    System.out.println(Fire.b);
	    System.out.println(Fire.c);
	    System.out.println(Fire.d);
	}

}
