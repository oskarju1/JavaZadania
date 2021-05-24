package com.company.devices;

public class Electric extends Car {

    public Electric(String producer, String model, String color, Double value, Integer yearOfProduction) {
        super(producer, model, color, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Samochód naładowany");
    }
}