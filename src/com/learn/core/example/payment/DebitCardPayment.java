package com.learn.core.example.payment;

public class DebitCardPayment extends CardPayment {

	@Override
	public void makePayment() {
		System.out.println("made DebitCardPayment");
	}
	
}