package com.vishal.Upcasting;

class Delta{
	int num = 10;
	
}

class Example extends Delta{
	int val = 20;
}



public class MainClass3 {
	public static void main(String[] args) {
		Delta ref = new Example(); // UPCASTING: Example ----> delta
		
		System.out.println(ref);
	}

}
