package com.company.Refactoritzacions_9.Pull_up;

public class Vehicle {
    protected String name;
    private String plate;

    public void start() {
    }

    public String getName() {
        return name;
    }

    public String getPlate() {
        return plate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
