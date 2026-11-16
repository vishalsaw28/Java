package com.vishal.variableShadowing;

class Delta{
	static void play() {
		System.out.println("Hiiiiiii");
	}
}

class Gamma extends Delta{
	static void play() {
		System.out.println("Hellloooo");
	}
}


public class MainClass2 {
	public static void main(String[] args) {
		Delta d = new Delta();
		d.play();
		Gamma g = new Gamma();
		g.play();
		Delta d1 = new Gamma();
		d1.play();
		
		
	}

}
