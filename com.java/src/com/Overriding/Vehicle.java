package com.Overriding;

class Vehicle {
	
	public void sound() {
		System.out.println("The Vehicle makes a Sound");
	}
	
	public String description() {
		return "This is a vehicle.";
	}

}

class Car extends Vehicle{
	@Override
	public void sound() {
		System.out.println("The Car Honks");
	}
	@Override
	public String description() {
		return "Ford Torino";
	}
}

class Motorcycle extends Vehicle {

    @Override
    public void sound() {
        System.out.println("The motorcycle beeps.");
    }

    @Override
    public String description() {
        return "This is a motorcycle (Royal Enfield).";
    }
}