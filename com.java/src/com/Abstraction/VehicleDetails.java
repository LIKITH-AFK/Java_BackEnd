package com.Abstraction;

public class VehicleDetails {

    public static void main(String[] args) {

        Car car = new Car("Toyota Camry","ABC123","Toyota",4,true);

        Bike bike = new Bike("Yamaha R1","XYZ789","Yamaha",false);

        Truck truck = new Truck("Volvo FH","DEF456","Volvo",20000);

        System.out.println("===== CAR DETAILS =====");
        car.displayCarDetails();
        car.startEngine();
        car.fuelType();

        System.out.println("\n===== BIKE DETAILS =====");
        bike.displayBikeDetails();
        bike.startEngine();
        bike.fuelType();

        System.out.println("\n===== TRUCK DETAILS =====");
        truck.displayTruckDetails();
        truck.startEngine();
        truck.fuelType();
    }
}