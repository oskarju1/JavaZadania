package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Phone;
import com.company.devices.Car;

public class Human extends Animal implements Washable, Comparable<Human>{
    public String firstName;
    public String lastName;
    public String phone;
    public Pet pet;
    public Double cash;
    public Car[] garage;
    private static final int DEFAULT_CARS = 2;
    static final public String SPECIES = "homo sapiens";

    public Human(String firstName, String lastName, String phone) {
        super("homosapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Car getCar(int parkID) {
        return this.garage[parkID];
    }

    public double getGarageValue() {
        double value = 0;
        for (Car car : garage) {
            value += car.value;
        }
        return value;
    }



    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", auto=" + garage +
                ", cash=" + cash +
                '}';
    }

    public void sell(Human me, Human brother, Double price) {

    }

    @Override
    public void pay(Double price) {

    }

    @Override
    public Double getCash() {
        return cash;
    }

    public int compareTo(Human otherHuman) {
        return (int)  (this.weight - otherHuman.weight);
    }

    @Override
    public void wash() {

    }

    @Override
    public void dry() {

    }
}
