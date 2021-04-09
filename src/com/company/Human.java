package com.company;
import java.time.LocalDate;

public class Human {
    public String firstName;
    public String lastName;
    public String phone;
    protected Animal pet;
    protected Car auto;
    private Double salary;

    public Human(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.salary = 23892183.00;
    }

    public Double getSalary() {
        System.out.println(java.time.LocalDate.now());
        System.out.println(this.salary);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            System.out.println("Dane zostały wysłane do systemu księgowego");
            System.out.println("Nalezy koniecznie odebrać aneks do umowy od Pani Hani z kadr");
            System.out.println("ZUS i US już o tobie wiedzą nie ukrywaj dochodu");
            this.salary = salary;
        } else {
            System.out.println("Nie mozna przypisac ujemnej wartosci wynagrodzenia");
        }
    }
}
