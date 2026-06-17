package com.Abstraction;

public class Truck extends Vehicle {

    private double cargoCapacity;

    public Truck(String modelName, String vehicleNumber, String company,
                 double cargoCapacity) {

        super(modelName, vehicleNumber, company);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine with heavy-load warm-up.");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel Type : Diesel");
    }

    public void displayTruckDetails() {
        displayDetails();
        System.out.println("Cargo Capacity : " + cargoCapacity + " kg");
    }
}