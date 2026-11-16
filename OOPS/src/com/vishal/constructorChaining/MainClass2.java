package com.vishal.constructorChaining;


class Order{
	Order(){
		System.out.println("Burger");
	}
	
	Order(int a){
		this();
		System.out.println("Fries");
	}
	
	Order(double d){
		this(10);
		System.out.println("Coke");
	}
}


public class MainClass2 {
	public static void main(String[] args) {
		Order o = new Order(433);
	}
	
	

}
