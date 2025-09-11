package com.gla.oops;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Mahak", bank);
        Customer c2 = new Customer("Aman", bank);

        c1.display();
        c2.display();
    }
}
