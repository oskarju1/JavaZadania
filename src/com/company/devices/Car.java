package com.company.devices;

import com.company.Human;

import java.util.ArrayList;

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

    public ArrayList<Human> Owners = new ArrayList<>();

    public Human getCurrentOwner() {
        if (Owners.isEmpty())
            return null;
        else
            return Owners.get(Owners.size() - 1);
    }

    public void addOwner(Human human) {
        Owners.add(human);
    }

    public boolean wasOwner(Human human) {
        return Owners.contains(human);
    }

    public int transactionID() {
        return Owners.size();
    }

    public boolean isCarSold(Human buyer, Human seller){ return Owners.lastIndexOf(seller) == Owners.lastIndexOf(buyer); }

}

