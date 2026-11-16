package com.vishal.BeanClass;

public class MainClass3 {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setEmployeeId(23);
		e.setEmployeeCtc(5);
		System.out.println("Employee id is: "+ e.getEmployeeId());
		System.out.println("Employee ctc is: "+ e.getEmployeeCtc());

	}

}
