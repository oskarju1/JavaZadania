package com.company;
import com.company.devices.Phone;
import com.company.devices.Car;

public class Human extends Animal implements Washable, Comparable<Human>{
    public String firstName;
    public String lastName;
    public Phone phone;
    public Car auto;
    protected Animal pet;
    public Double cash;

    static final public String SPECIES = "homo sapiens";

    public Human() {
        super(SPECIES);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", auto=" + auto +
                ", cash=" + cash +
                '}';
    }

    public void wash() {
        System.out.println("myju myju");
    }

    public void dry() {
        System.out.println("shuuuuuuuuu");
    }

    public void sell(Human me, Human brother, Double price) {

    }

    public int compareTo(Human otherHuman) {
        return (int)  (this.weight - otherHuman.weight);
    }
}
