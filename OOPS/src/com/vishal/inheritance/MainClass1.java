package com.vishal.inheritance;



class Parent {
	void pray() {
		System.out.println("Parent is Praying");
	}
}

class Child extends Parent{
	
}

public class MainClass1 {
	public static void main(String[] args) {
		
	
	Child c = new Child();
	c.pray();

	}
}
