package com.lti.model;

public class DegreeCourse extends Course {
	private DegreeLevel degreeLevel;
	private boolean isPlacementAvailable;

	public DegreeCourse() {
		super();// calls the default constructor of the Parent(Course) class

	}

	public DegreeCourse(int id, String name, int duration, double fees, DegreeLevel degreeLevel,
			boolean isPlacementAvailable) {
		super(id, name, duration, fees); // calls the parameterized constructor of the parent class
		this.degreeLevel = degreeLevel;
		this.isPlacementAvailable = isPlacementAvailable;

	}

	public DegreeLevel getDegreeLevel() {
		return degreeLevel;
	}

	public void setDegreeLevel(DegreeLevel degreeLevel) {
		this.degreeLevel = degreeLevel;
	}

	public boolean isPlacementAvailable() {
		return isPlacementAvailable;
	}

	public void setPlacementAvailable(boolean isPlacementAvailable) {
		this.isPlacementAvailable = isPlacementAvailable;
	}

	public void calculateMonthlyFee() {
		System.out.println(super.getId()+" "+super.getName()+" "+super.getDuration());
		super.calculateMonthlyFee();// reused base class method
		// if placement is available then pay 10% more of total fees
		if (isPlacementAvailable) {
			System.out.println("Total Fees: " + (super.getFees() * 1.1));
			System.out.println("In addition to monthly fee, you need to pay "+(super.getFees()*0.1)+" as placement fee.");
		} else {
			System.out.println("Total Fees: " + (super.getFees()));
		}
	}
}
