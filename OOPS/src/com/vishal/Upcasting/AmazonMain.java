package com.vishal.Upcasting;

public class AmazonMain {
	public static void main(String[] args) {
		Marshell m = new Marshell();
		Amazon.addToCart(m);
	    System.out.println("------------------");
	    
	    MacBook m2 = new MacBook();
		Amazon.addToCart(m2);
	    System.out.println("------------------");
	    
	    ps5 p = new ps5();
		Amazon.addToCart(p);
	    System.out.println("------------------");
	    
	    
	    Armani a = new Armani();
	    Amazon.addItem(a);
	    System.out.println("------------------");

	    
	    Jordan1 j = new Jordan1();
	    Amazon.addItem(j);
	    System.out.println("------------------");

	    
	    Rolex r = new Rolex();
	    Amazon.addItem(r);
	    System.out.println("------------------");

	    
		
	}

}
