import java.util.*;

public class StudentMarksScorecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"Math", "Science", "English", "Computer", "History"};
        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = (total / 500.0) * 100;
        System.out.println("Total: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) System.out.println("Grade: A");
        else if (percentage >= 75) System.out.println("Grade: B");
        else if (percentage >= 60) System.out.println("Grade: C");
        else if (percentage >= 40) System.out.println("Grade: D");
        else System.out.println("Grade: F");

        sc.close();
    }
}
