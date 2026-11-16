package com.vishal.Upcasting;

class Demo{
	
}
class Sample extends Demo{
	
}

public class MainClass1 {
	public static void main(String[] args) {
		
	
	Sample obj = new Sample();
	Demo ref = obj;
	
   System.out.println(obj);
   System.out.println(ref);
   
	
	}
}
