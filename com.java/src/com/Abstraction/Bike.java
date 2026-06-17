package com.Abstraction;

public class Bike extends Vehicle {

    private boolean hasSidecar;

    public Bike(String modelName, String vehicleNumber, String company,
                boolean hasSidecar) {

        super(modelName, vehicleNumber, company);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine with kick-start.");
    }

    public void displayBikeDetails() {
        displayDetails();
        System.out.println("Has Sidecar : " + hasSidecar);
    }
}