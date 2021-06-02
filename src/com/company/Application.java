package com.company;

public class Application {

    String name;
    String version;
    Double price;

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public static void add(Application app) {
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public Double getPrice() {
        return price;
    }
}
