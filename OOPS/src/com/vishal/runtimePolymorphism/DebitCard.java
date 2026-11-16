package com.vishal.runtimePolymorphism;

 class DebitCard extends Card{
	@Override
	 void swipe() {
		System.out.println("Balance reduces");

	}

}
