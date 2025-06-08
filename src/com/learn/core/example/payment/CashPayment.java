package com.learn.core.example.payment;

public class CashPayment extends Payment {

	@Override
	public void makePayment() { 
		System.out.println("made Cash Payment");
	}
	
}