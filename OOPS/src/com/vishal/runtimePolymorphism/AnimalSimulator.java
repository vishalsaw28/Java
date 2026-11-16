package com.vishal.runtimePolymorphism;

public class AnimalSimulator {
	
	static void makenoise(Animal a) {
		
		if(a != null)
		{
			a.noise();
		}
	}

}
