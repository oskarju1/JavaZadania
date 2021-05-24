package com.company.devices;

import com.company.Human;




public class Phone extends Device {
    final public Double screenSize;
    final public String operationSystem;
    public String appName;
    public Double appVersion;
    public String serverAddress;
    public String[] applist;

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

    public void installAnApp(String appName){
        this.appName = appName;
    }

    public void installAnApp(String appName, Double appVersion){
        this.appName = appName;
        this.appVersion = appVersion;
    }

    public void installAnApp(String appName, Double appVersion, String serverAddress){
        this.appName = appName;
        this.appVersion = appVersion;
        this.serverAddress = serverAddress;
    }

    public void installAnApp(String[] applist){
        this.applist = applist;
    }

}
