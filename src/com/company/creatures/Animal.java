package com.company.creatures;

import com.company.Human;

import java.io.File;

public abstract class Animal {
    final public String species;
    public Double weight;
    public String name;
    public File pic;

    static final public double DEFAULT_ANIMAL_WEIGHT = 1.0;
    static final public double DEFAULT_DOG_WEIGHT = 3.0;
    static final public double DEFAULT_CAT_WEIGHT = 2.0;
    static final public double DEFAULT_COW_WEIGHT = 300.0;

    public Animal(String species){
        this.species = species;

        switch (this.species) {
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "cow" -> this.weight = DEFAULT_COW_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed() {
        if (weight > 0) {
            weight += 1;
            System.out.println("Thx for food");
        }
    }
    public void walk(){
        if(this.weight <= 0) {
            System.out.println("You cannot walk the town with dead animal!!!");
        }
        else {
            weight -= 1;
            System.out.println(species + " Lost 1kg of weight");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                '}';
    }

    public void sell(Human seller, Human buyer, Double price){
        if(seller.pet != this){
            System.out.println("Nie mozesz sprzedac czegos czego nie posiadasz");
        }
        else if(buyer.cash < price){
            System.out.println("Nie stac cie");
        }
        else{
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Transakcja udana sprzedano" + this + "za" + price);
        }
    }

    public abstract void pay(Double price);

    public abstract Double getCash();
}
