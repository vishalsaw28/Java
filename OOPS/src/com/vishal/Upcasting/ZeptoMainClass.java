package com.vishal.Upcasting;


public class ZeptoMainClass {
	public static void main(String[] args) {
		Apple a = new Apple();
		Zepto.addToBasket(a);
	    System.out.println("------------------");
	    
	    Banana b = new Banana();
	    Zepto.addToBasket(b);
	    System.out.println("------------------");

	    Mango m = new Mango();
	    Zepto.addToBasket(m);
	    System.out.println("------------------");

		
	}

}
