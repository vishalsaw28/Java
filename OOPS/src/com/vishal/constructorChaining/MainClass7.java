package com.vishal.constructorChaining;

class Delta {
	Delta(){
		System.out.println("Delta() constructor");
	}
	
	Delta(int a){
		System.out.println("Delta(int) constructor");
	}
}

class Example extends Delta{
	Example(){  // Implicitly performs constructor chaining with ZERO-ARG  constructor.
		System.out.println("Example() constructor.");
	}
}




public class MainClass7 {
	
	public static void main(String[] args) {
		Example ex = new Example();
	}

}
