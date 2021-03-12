package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();


        Human me = new Human();
        me.firstName = "Oskar";
        me.lastName = "Jurgielaniec";
        me.pet = dog;

    }
}