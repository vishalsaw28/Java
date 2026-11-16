package com.vishal.inheritance;

class Whatsapp1{
	void message() {
		System.out.println("Message feature.");
	}
}

class Whatsapp2 extends Whatsapp1 {
	void call() {
		System.out.println("Call feature.");
	}
}

class Whatsapp3 extends Whatsapp2{
	void status() {
		System.out.println("Status feature.");
	}
}

public class MainClass5 {
	
	public static void main(String[] args) {
		Whatsapp3 ref = new Whatsapp3();
		
		ref.message();
		ref.call();
		ref.status();
	}

}
