package com.learn.core.example.payment;

public abstract class Payment {
	public  abstract void makePayment();
	
	public void authorizedBy () {
		System.out.println("Authorized by RBI");
	}
	
/*
	Access Modifier, in child class, cannot be more restrictive than in parent class
	Return type .. in child class , can only be co-variant/child class of return value in Parent Class
*/
	public Number getNum() { return null; }
	
}





class PaymentChild extends Payment {
	
	public void authorizedBy () {
		System.out.println("Authorized by RBI");
	}

	@Override
	public void makePayment() {
		
	}
	
	public Integer getNum() { return null; }

	
}