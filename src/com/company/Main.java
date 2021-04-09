package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        dog.feed();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();

        Human me = new Human("Oskar", "Jurgielaniec", "593292322");
        me.firstName = "Oskar";
        me.lastName = "Jurgielaniec";
        me.pet = dog;
        me.auto = new Car("VW", "Golf", "silver", 10000.00);
        me.setCar(me.auto);
        System.out.println(me.getCar());

        me.getSalary();
        me.setSalary(2313.00);
    }
}
