import java.util.*;




public class Cricket_Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of batsmen: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        System.out.println("Enter scores of " + n + " batsmen:");

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;
        boolean century = false;

        for (int i = 0; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {   
                lowest = scores[i];
            }
            sum += scores[i];
            if (scores[i] >= 100) {
                century = true;
            }
        }

        double average = (double) sum / n;

        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);

        if (century) {
            System.out.println("Century Scorer Found!");
        }

        sc.close();
    }
}
