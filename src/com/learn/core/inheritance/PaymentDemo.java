package com.learn.core.inheritance;

public class PaymentDemo {
	public static void main(String[] args) {
		// Payment p=new Payment(); // compile error because Payment is abstract 
		
		CashPayment cashPay=new CashPayment();
		CardPayment debitCardPay = new DebitCardPayment() ;
		CardPayment creditCardPay = new CreditCardPayment() ;
		
		takePayment(cashPay);
		takePayment(debitCardPay);
		takePayment(creditCardPay);
		
	}
	
	public static void takePayment (Payment p) {
		p.makePayment();
	}
}


abstract class Payment {
	abstract void makePayment();
	
	public void authorizedBy () {
		System.out.println("Authorized by RBI");
	}
	
}

class CashPayment extends Payment {

	@Override
	void makePayment() {
		
		// 
		System.out.println("made Cash Payment");
	}
	
}

abstract class CardPayment extends Payment {
}

class DebitCardPayment extends CardPayment {

	@Override
	void makePayment() {
		System.out.println("made DebitCardPayment");
	}
	
}

class CreditCardPayment extends CardPayment {

	@Override
	void makePayment() {		
		System.out.println("made CreditCardPayment");
	}
	
}