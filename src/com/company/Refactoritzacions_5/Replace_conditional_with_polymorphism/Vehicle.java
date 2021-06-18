package com.company.Refactoritzacions_5.Replace_conditional_with_polymorphism;

public abstract class Vehicle {

	private int vehicleType;
	private int speed;
	private int acceleration;

	public Vehicle(int speed, int acceleration) {
		this.speed = speed;
		this.acceleration = acceleration;
	}
	
	public abstract int move ();

	public int getSpeed() {
		return speed;
	}

	public int getAcceleration() {
		return acceleration;
	}
}
