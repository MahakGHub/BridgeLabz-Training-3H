import java.util.Scanner;

public class ATM {
    static int balance = 0;

    static void deposit(int amount) {
        balance += amount;
    }

    static void withdrawal(int amount) {
        balance += amount;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter transaction (positive=deposit, negative=withdrawal, 0=exit): ");

        while (true) {
            int amount = sc.nextInt();

            if (amount == 0) {  
                break;
            } else if (amount > 0) {
                deposit(amount);
            } else {
                withdrawal(amount);
            }
        }

        if (balance < 0) {
            System.out.println("Overdraft: " + balance);
        } else {
            System.out.println("Final amount: " + balance);
        }

        sc.close();
    }
}
