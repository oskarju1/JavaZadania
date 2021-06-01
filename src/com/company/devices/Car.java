package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {
    public String color;
    public Double value;

    public Car(String producer, String model, String color, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.value = value;
    }

    public void turnOn(){
        System.out.println("wlacz silnik");
    }
    public abstract void refuel();

    public void sell(Human seller, Human buyer, Double price){
        System.out.println("Nie mozesz sprzedac czegos czego nie posiadasz");
    }


}


