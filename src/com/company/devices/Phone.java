package com.company.devices;

import com.company.Application;
import com.company.Human;




public class Phone extends Device {
    final public Double screenSize;
    final public String operationSystem;
    public String appName;
    public Double appVersion;
    public String serverAddress;
    public String[] applist;
    Human Owners;

    public Phone(String producer, String model, Integer yearofproduction, Double screenSize, String operationSystem) {
        super(producer, model, yearofproduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public void turnOn() {
        System.out.println("podaj odcisk palca");
    }

    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Nie mozesz sprzedac czegos czego nie posiadasz");
    }

    public void installAnApp(String appName) {
        this.appName = appName;
    }

    public void installAnApp(String appName, Double appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }

    //public void installAnApp(String appName, Double appVersion, String serverAddress) {
    //      this.appName = appName;
    //      this.appVersion = appVersion;
    //      this.serverAddress = serverAddress;
    //}

    public void installAnApp(String[] applist) {
        this.applist = applist;
    }

    public void installApp(Application App) {
        if (this.Owners.getCash() >= App.getPrice()) {
            Application.add(App);
            Owners.pay(App.getPrice());
            System.out.println("Kupiono: " + App);
        } else {
            System.out.println("Brak funduszy :/");
        }

    }
}