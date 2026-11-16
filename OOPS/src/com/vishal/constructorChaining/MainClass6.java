package com.vishal.constructorChaining;

class Alpha{
	Alpha(){
	  System.out.println("Alpha() constructor.");	
	}
}

class Beta extends Alpha{
	Beta(){ // Here compiler implicitly performs constructor chaining.
		System.out.println("Beta() constructor.");
	}
}

public class MainClass6 {
	
	public static void main(String[] args) {
	   Beta b = new Beta();
	}

}
