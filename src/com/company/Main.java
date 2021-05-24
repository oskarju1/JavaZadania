package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Phone;

public class Main {

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
