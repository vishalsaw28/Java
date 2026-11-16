package com.vishal.inheritance;

class Demo {
	void test()
{
		System.out.println("Executing test()...");
		}
}

class Sample extends Demo{
	void disp() {
		System.out.println("Executing disp()....");
	}
}


public class MainClass2 {
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.test();
		s.disp();
		
		Demo d = new Demo();
		d.test();
//		d.disp();//
		
		
	}

}
