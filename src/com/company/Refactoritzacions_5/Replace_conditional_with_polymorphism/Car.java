package com.company.Refactoritzacions_5.Replace_conditional_with_polymorphism;

public class Car extends Vehicle {

    public Car(int speed, int acceleration) {
        super(speed, acceleration);
    }

    @Override
    public int move() {
        return getSpeed() * getAcceleration() * 5;
    }
}