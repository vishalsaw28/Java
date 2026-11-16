package com.vishal.constructorChaining;

	
	class City{
		
		City(){
			System.out.println("Bangalore.");
		}
		
		City(int a){
			this();
			System.out.println("Chennai.");
		}
		City(double d){
			this(10);
			System.out.println("Hydrabad.");
		}
	}
	
	public class MainClass1 {
	public static void main(String[] args) {
		
		City c1 = new City(4.5);
	} 
	

}
