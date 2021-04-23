package com.company.devices;

import com.company.Human;

public class Phone extends Device {
    final public Double screenSize;
    final public String operationSystem;

    public Phone(String producer, String model, Integer yearofproduction, Double screenSize, String operationSystem) {
        super(producer, model, yearofproduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public void turnOn(){
        System.out.println("podaj odcisk palca");
    }

    public void sell(Human seller, Human buyer, Double price){
        if(seller.phone != this){
            System.out.println("Nie mozesz sprzedac czegos czego nie posiadasz");
        }
        else if(buyer.cash < price){
            System.out.println("Nie stac cie");
        }
        else{
            seller.cash += price;
            buyer.cash -= price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Transakcja udana sprzedano" + this + "za" + price);
        }
    }
}
