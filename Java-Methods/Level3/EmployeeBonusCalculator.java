public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        double salary = 50000;
        double experience = 6; // years
        double bonus = 0;

        if (experience > 5) {
            bonus = salary * 0.20; // 20% bonus
        } else if (experience >= 3) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.05;
        }

        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}
