package com.company.devices;

public class LPG extends Car{
    public LPG(String producer, String model, String color, Double value, Integer yearOfProduction) {
        super(producer, model, color, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano LPG");
    }
}