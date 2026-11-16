package com.vishal.HasARelationship;

class Engine{
	void Power() {
		System.out.println("Generate Power");
	}
}

class Driver{
	void drive() {
		System.out.println("Dtiving");
	}
}

class Car {
	Engine e = new Engine();
	Driver d;
	
      Car(Driver d){
    	  this.d = d;
      }
      
}

public class MainClass1 {
	
	public static void main(String[] args) {
		Driver d1 = new Driver();
		Car c1 = new Car(d1);
		
		c1.e.Power();
		c1.d.drive();
	}

}
