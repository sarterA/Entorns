package com.company.Refactoritzacions_5.Replace_conditional_with_polymorphism;

public class Plane extends Vehicle {

	public Plane(int speed, int acceleration) {
		super(speed, acceleration);
	}

	@Override
	public int move() {
		return getAcceleration() * 2;
	}
	
}