package com.vishal.Upcasting;

public class PaintMainClass {
	public static void main(String[] args) {
		Circle c = new Circle();
		Paint.drawShape(c);
		System.out.println("======================");
		
		Square s = new Square();
		Paint.drawShape(s);
		System.out.println("======================");
		
		Triangle t  = new Triangle();
		Paint.drawShape(t);
		System.out.println("======================");

	}

}
