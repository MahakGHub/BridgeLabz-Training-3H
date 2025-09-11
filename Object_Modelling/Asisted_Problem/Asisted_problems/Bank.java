package com.gla.oops;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Bank: " + name);
    }
}
