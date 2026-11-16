package com.jspider.module2;

import java.util.Scanner;

public class PersonHelper {
	
	static void showPersonDetails(Person p) {
		if( p != null) {
			System.out.println("Age: "+p.age);
			System.out.println("Height: "+p.height);
			System.out.print("Weight: "+ p.weight);


		}
	}
	
	static Person createPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		
		System.out.println("Enter Height:");
		double height = sc.nextDouble();
		
		System.out.println("Enter Weight: ");
		double weight = sc.nextDouble();
		
		
		Person p = new Person(age, height, weight);
		return p;
				
	}

}
