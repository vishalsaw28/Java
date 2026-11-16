package com.vishal.inheritance;

class InstagramV1 {
	void post() {
		System.out.println("Insta post");
	}
}

class InstagramV2 extends InstagramV1{
	void messanger() {
		System.out.println("Insta message.");
	}
}

public class MainClass4 {
	
	public static void main(String[] args) {
		InstagramV2 ref = new InstagramV2();
		ref.post();
		ref.messanger();
	}

}
