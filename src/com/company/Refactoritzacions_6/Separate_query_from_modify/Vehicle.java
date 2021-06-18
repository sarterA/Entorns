package com.company.Refactoritzacions_6.Separate_query_from_modify;


public class Vehicle {
	private int horsePower;
	private String type;

	public Vehicle(int power) {
		initVehicle(power);
	}

	private void initVehicle(int power) {
		horsePower = power;

		if (power >= 10) {
			type = "Truck";
		}
		if (power > 5 && power < 10) {
			type = "Car";
		} else {
			type = "Bike";
		}
	}

	public int getHorsePower() {
		return horsePower;
	}

	public String getType() {
		return type;
	}
}
