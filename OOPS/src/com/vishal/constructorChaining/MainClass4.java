package com.vishal.constructorChaining;

class Student{
	Student(){
		System.out.println("Personal details (6 lines)");
		System.out.println("Academic details (12 lines)");
	}
	
	Student(boolean b){
		this();
		System.out.println("Experience details (5 lines)");
	}
}


public class MainClass4 {
	public static void main(String[] args) {
		Student fresher = new Student();
		Student experienced = new Student(true);
	}

}
