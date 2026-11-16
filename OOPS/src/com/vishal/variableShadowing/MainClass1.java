package com.vishal.variableShadowing;

class Alpha{
	int x = 10;
}

class Beta extends Alpha{
	int x = 20;
	void disp() {
		System.out.println(x);
		System.out.println(super.x);
	}
}



public class MainClass1 {
  public static void main(String[] args) {
	System.out.println(new Alpha().x);
	System.out.println(new Beta().x);
	
	new Beta().disp();
}

}
