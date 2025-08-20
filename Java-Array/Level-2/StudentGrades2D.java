import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // [physics, chemistry, maths]
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks of student " + (i + 1) + ": ");
            marks[i][0] = sc.nextInt();
            if (marks[i][0] < 0) { System.out.println("Invalid! Enter again."); i--; continue; }

            System.out.print("Enter Chemistry marks of student " + (i + 1) + ": ");
            marks[i][1] = sc.nextInt();
            if (marks[i][1] < 0) { System.out.println("Invalid! Enter again."); i--; continue; }

            System.out.print("Enter Maths marks of student " + (i + 1) + ": ");
            marks[i][2] = sc.nextInt();
            if (marks[i][2] < 0) { System.out.println("Invalid! Enter again."); i--; continue; }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" + percentage[i] + "\t\t" + grade[i]);
        }

        sc.close();
    }
}
