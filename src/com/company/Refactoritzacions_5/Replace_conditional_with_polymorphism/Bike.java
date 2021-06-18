package com.company.Refactoritzacions_5.Replace_conditional_with_polymorphism;

public class Bike extends Vehicle {

	public Bike(int speed, int acceleration) {
		super(speed, acceleration);
	}

	@Override
	public int move() {
		return getSpeed() * 10;
	}
}