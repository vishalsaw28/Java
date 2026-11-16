package com.vishal.partialAbstraction;

abstract class Demo{
	abstract void test();
	abstract void disp();
}

class Sample extends Demo{
	@override
	void test() {
		System.out.println("Executing test()......");
	}
	
	@override
	void disp() {
		System.out.println("Executing disp().....");
	}
}

public class MainClass1 {
	
	public static void main(String[] args) {
		Demo  ref = new Sample();
		ref.test();
		ref.disp();
	}

}
