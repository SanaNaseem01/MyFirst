package com.lti.model;

public class DiplomaCourse extends Course {
	private Type type;

	public DiplomaCourse() {
		super();
	}

	public DiplomaCourse(int id, String name, int duration, double fees, Type type) {
		super(id, name, duration, fees);
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	public void calculateMonthlyFee() {
		System.out.println(super.getId()+" "+super.getName()+" "+super.getDuration());
		super.calculateMonthlyFee();//reused the parent class method
		//if professional then 10% will be charged
		//if academic then 5% will be charged
		
		if(type.name().equals("Professional")) {
			System.out.println("Total Fees: "+(super.getFees()*1.1));
		}
		else {
			System.out.println("Total Fees: "+(super.getFees()*1.05));
		}
	}

}