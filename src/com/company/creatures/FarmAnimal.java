package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void pay(Double price) {

    }

    @Override
    public Double getCash() {
        return null;
    }

    public void beEaten() {

    }
    public void feed(Double foodWeight) {

    }
}