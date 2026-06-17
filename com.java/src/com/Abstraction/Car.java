package com.Abstraction;

public class Car extends Vehicle {

    private int numberOfDoors;
    private boolean hasSunroof;

    public Car(String modelName, String vehicleNumber, String company,
               int numberOfDoors, boolean hasSunroof) {

        super(modelName, vehicleNumber, company);
        this.numberOfDoors = numberOfDoors;
        this.hasSunroof = hasSunroof;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine with key ignition.");
    }

    public void displayCarDetails() {
        displayDetails();
        System.out.println("Number Of Doors : " + numberOfDoors);
        System.out.println("Has Sunroof     : " + hasSunroof);
    }
}