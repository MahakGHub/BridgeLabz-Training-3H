import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Find youngest
        int minAge = ages[0], minIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                minIndex = i;
            }
        }

        // Find tallest
        int maxHeight = heights[0], maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                maxIndex = i;
            }
        }

        // Output
        System.out.println("\nYoungest Friend: " + friends[minIndex] + " (Age: " + minAge + ")");
        System.out.println("Tallest Friend: " + friends[maxIndex] + " (Height: " + maxHeight + " cm)");

        sc.close();
    }
}
