package com.vishal.partialAbstraction;


abstract class Delta{
	void help() {
		System.out.println("Executing help()....");
	}
	
	void start() {
		System.out.println("Executing start()....");
	}
}

class Example extends Delta{
	
}


public class MainClass3 {
	
	public static void main(String[] args) {
		Delta ref = new Example();
		ref.help();
		ref.start();
	}

}
