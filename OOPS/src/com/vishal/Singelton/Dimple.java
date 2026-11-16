package com.vishal.Singelton;

public class Dimple {
	private Dimple() {
		
	}
	
	private static Dimple d= new Dimple();
	
	public static Dimple getDimple() {
		if(d == null) {
			d = new Dimple();
		}
		return d;
	}

}
