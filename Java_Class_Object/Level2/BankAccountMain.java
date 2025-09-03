public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Teesha", 12345, 5000);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayBalance();
    }
}