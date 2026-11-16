package com.vishal.constructorChaining;

class Amazon{
	Amazon(){
		System.out.println("Initialize shopping (100 lines)");
		
	}
	
	Amazon(double price){
		System.out.println("Initialize video (100 lines)");
		System.out.println("Inoitialize music (100 ines)");
	}
}

public class MainClass3 {
	
	public static void main(String[] args) {
		Amazon shopping = new Amazon();
		Amazon prime = new Amazon(499.0);//
	}
	

}
