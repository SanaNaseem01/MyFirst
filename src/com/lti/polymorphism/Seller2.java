package com.lti.polymorphism;

public class Seller2 extends Amazon {
	public Seller2() {
		super();
	}

	@Override // overridden the purchase method
	void purchase(double price) {

		double totalPrice = price * amazonDiscount() - seller2Discount();
		System.out.println("Amount to be paid to Seller 2: " + totalPrice);
	}

	private double seller2Discount() {
		return 0.02;
	}

}
