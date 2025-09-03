import java.util.Scanner;

public class FriendsComparisonProgram {
    public static String findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[minIndex]) minIndex = i;
        return new String[]{"Amar", "Akbar", "Anthony"}[minIndex];
    }

    public static String findTallest(int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[maxIndex]) maxIndex = i;
        return new String[]{"Amar", "Akbar", "Anthony"}[maxIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println("Youngest: " + findYoungest(ages));
        System.out.println("Tallest: " + findTallest(heights));
    }
}
