import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Years of Service: ");
        int years = sc.nextInt();

        double bonus;

        // Bonus calculation based on years of service
        if (years > 10) {
            bonus = salary * 0.10;  // 10% bonus
        } else if (years >= 6) {
            bonus = salary * 0.08;  // 8% bonus
        } else {
            bonus = salary * 0.05;  // 5% bonus
        }

        // Output
        System.out.println("\n--- Employee Bonus Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Years  : " + years);
        System.out.println("Bonus  : " + bonus);

        sc.close();
    }
}
