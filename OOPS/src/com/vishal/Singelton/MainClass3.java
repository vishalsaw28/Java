package com.vishal.Singelton;

public class MainClass3 {
	
	public static void main(String[] args) {
		Dimple d1 = Dimple.getDimple();
		Dimple d2 = Dimple.getDimple();
		Dimple d3 = Dimple.getDimple();
		Dimple d4 = Dimple.getDimple();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}

}
