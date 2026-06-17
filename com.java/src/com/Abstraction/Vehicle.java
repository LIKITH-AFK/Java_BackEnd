package com.Abstraction;

public abstract class Vehicle {

    protected String modelName;
    protected String vehicleNumber;
    protected String company;

    public Vehicle(String modelName, String vehicleNumber, String company) {
        this.modelName = modelName;
        this.vehicleNumber = vehicleNumber;
        this.company = company;
    }

    public abstract void startEngine();

    public void fuelType() {
        System.out.println("Fuel Type : Petrol");
    }

    public void displayDetails() {
        System.out.println("Model Name     : " + modelName);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Company        : " + company);
    }
}