package com.learn.core.example.payment;

public class CreditCardPayment extends CardPayment {

	@Override
	public void makePayment() {		
		System.out.println("made CreditCardPayment");
	}
	
}