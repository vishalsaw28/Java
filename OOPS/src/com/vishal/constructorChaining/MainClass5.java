package com.vishal.constructorChaining;

class Demo {
	Demo(){
		System.out.println("Demo() onstructor.");
	}
	
	Demo(int a){
		this();
		System.out.println("Demo() with paramenter.");
	}
}

class Sample extends Demo {
	Sample(){
		super(20);
		System.out.println("Sample() constructor.");
	}
}

public class MainClass5 {
	public static void main(String[] args) {
		Sample s = new Sample();
	}
	

}
