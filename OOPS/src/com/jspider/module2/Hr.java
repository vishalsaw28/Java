package com.jspider.module2;

import java.util.Scanner;

public class Hr {
	
	static void displayEmployeeInfo(Employee e) {
		if( e != null) {
			System.out.println("Employee id:"+e.eid);
			System.out.println("Employee ctc:"+e.ctc);
		}
		
	}
	
	static Employee createEmployee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id:");
		int eid = sc.nextInt();
		
		System.out.println("Enter Employee ctc:");
		
		double ctc = sc.nextDouble();
		
		Employee e = new Employee(eid, ctc);
		return e;
		
	}

}
