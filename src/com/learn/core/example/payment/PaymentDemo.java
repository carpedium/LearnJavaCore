package com.learn.core.example.payment;

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









