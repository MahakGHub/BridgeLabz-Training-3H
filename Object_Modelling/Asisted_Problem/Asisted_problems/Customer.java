package com.gla.oops;

public class Customer {
    private String name;
    private Bank bank;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public void display() {
        System.out.println("Customer: " + name);
        bank.display();
    }
}
