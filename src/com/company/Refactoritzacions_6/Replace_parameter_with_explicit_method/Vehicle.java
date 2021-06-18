package com.company.Refactoritzacions_6.Replace_parameter_with_explicit_method;


public class Vehicle {

	private int acceleration;
	private int speed;
	
	public Vehicle(int acceleration, int speed) {
		this.acceleration = acceleration;
		this.speed = speed;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public int getSpeed() {
		return speed;
	}
}
