package com.vishal.runtimePolymorphism;

public class MianClass3 {
	
	public static void main(String[] args) {
		
		
		Dog d = new Dog();
		
		AnimalSimulator.makenoise(d);
		
		Cat c = new Cat();
		
		AnimalSimulator.makenoise(c);
		
	}

}
