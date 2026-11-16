package com.vishal.inheritance;
class Delta{
	static int val = 100;
}

class Example extends Delta{
	
}
public class MainClass3 {
	public static void main(String[] args) {
		Example ex = new Example();
		
		System.out.println(ex.val);
	}

}

