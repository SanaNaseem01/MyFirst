package com.lti.polymorphism;

public class Seller1 extends Amazon {
	public Seller1() {
		super();
	}

	@Override // overriden the purchase method
	void purchase(double price) {

		double totalPrice = price * amazonDiscount();
		System.out.println("Amount to be paid to Seller1: " + totalPrice);
	}

}
