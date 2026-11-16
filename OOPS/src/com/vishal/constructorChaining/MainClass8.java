package com.vishal.constructorChaining;

class Gamma{
	Gamma(){
		System.out.println("This is Alpha.");
	}
	
	Gamma(int a){
		System.out.println("This is parameterized Alpha");
	}
	
	class Beta{
		Beta(){
			System.out.println("This is Beta.");
		}
		
		Beta(int a){
			System.out.println("This is parameterized Beta.");
		}
	}
}

public class MainClass8 {
	
	public static void main(String[] args) {
		Beta b1 = new Beta();
		Alpha a = new Alpha();
	}

}
