package com.Overriding;

public class VehicleDetails {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Vehicle(),
                new Car(),
                new Motorcycle()
        };

        for (Vehicle v : vehicles) {

            v.sound();
            System.out.println(v.description());
            System.out.println();
        }
    }
}