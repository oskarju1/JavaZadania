package com.company.devices;

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
}
