package com.vishal.BeanClass;

public class MainClass4 {
	
	public static void main(String[] args) {
		Credentials c = new Credentials();
		
		c.setUsername("Vishal");
		c.setPassword("vishal@123");
		
		System.out.println("Username is: "+ c.getUsername());
		System.out.println("Password is: "+ c.getPassword());
	}

}
