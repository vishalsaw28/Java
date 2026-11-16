package com.vishal.partialAbstraction;


abstract class Alpha{
	abstract void play();
	void send() {
		System.out.println("Executin gsend()....");
	}
}

class Beta extends Alpha{
	@override
	void play() {
		System.out.println("Executing play()....");
	}
}


public class MainClass2 {
 public static void main(String[] args) {
	Alpha ref = new Beta();
	ref.play();
	ref.send();
}	

}
