package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    Diesel Audi = new Diesel("Audi", "80", "Black", 4500.0, 1995){
        @Override
        public void refuel() {

        }
    };
    LPG Golf = new LPG("VW", "Golf", "Silver", 2000.0, 2000){
        @Override
        public void refuel() {

        }
    };
    Electric Tesla = new Electric("Tesla", "S", "Red", 200000.0, 2020){
        @Override
        public void refuel() {

        }
    };



    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", "6S", 2010, 5.0, "iOS");
        iphone.turnOn();
        System.out.println(iphone.model);

        Human me = new Human();
        me.pet = new Pet("dog");
        me.cash = 0.0;
        Human brother = new Human();
        brother.cash = 1000.0;

        me.pet.sell(me, brother, 300.0);

    }
}
