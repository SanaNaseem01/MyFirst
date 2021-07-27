package com.lti.polymorphism;

public class IciciAtm implements ATM {
	private double balance = 10000;
	private double amount;

	@Override
	public void withdraw(double amount) {
		this.amount = amount;
		System.out.println("Amount withdrawn from ICICI: " + amount);

	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return balance - amount;
	}

}
