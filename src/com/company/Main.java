package com.company;

import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", "6S", 2010, 5.0, "iOS");
        iphone.turnOn();
        System.out.println(iphone.model);
    }
}
