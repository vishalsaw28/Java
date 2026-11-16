package com.vishal.inheritance;

class AdobeFree{
	void read() {
		System.err.println("Reading PDF Document");
	}
}

class AdobePaid extends AdobeFree{
	void edit() {
		System.out.println("Editing PDF Document");
	}
}

public class MainClass6 {
	
	public static void main(String[] args) {
		AdobePaid paid = new AdobePaid();
		
		paid.read();
		paid.edit();
		
		AdobeFree  free = new AdobeFree();
		free.read();
	}

}

