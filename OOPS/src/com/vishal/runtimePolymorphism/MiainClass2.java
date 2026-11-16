package com.vishal.runtimePolymorphism;

public class MiainClass2 {
	
	public static void main(String[] args) {
		
		FacebookMobile fmb = new FacebookMobile();
		
		DisplayAdapter.adapat(fmb);
		
		FacebookWebsite fwb = new FacebookWebsite();
		
		DisplayAdapter.adapat(fwb);
		
		
	}

}
