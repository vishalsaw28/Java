package com.jspider.module2;

public class MainClass1 {
	
	public static void main(String[] args) {
		Person p1 = PersonHelper.createPerson();
		PersonHelper.showPersonDetails(p1);
		
		Person p2 = PersonHelper.createPerson();
		PersonHelper.showPersonDetails(p2);
		
		
	}

}
