package com.vishal.inheritance;

class Watch{
	void time() {
		System.out.println("Showing time");
	}
	
	
}

class SmartWatch extends Watch{
	void notification() {
		System.out.println("Showing Notification");
	}
}

public class MainClass7 {
	public static void main(String[] args) {
		SmartWatch sw = new SmartWatch();
		sw.time();
		sw.notification();
	}

}
