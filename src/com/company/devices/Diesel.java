package com.company.devices;

public class Diesel extends Car {
    public Diesel(String producer, String model, String color, Double value, Integer yearOfProduction) {
        super(producer, model, color, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano samochód Dieslem");
    }
}