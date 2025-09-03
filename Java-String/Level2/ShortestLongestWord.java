import java.util.*;

public class ShortestLongestWord {
    public static String[] splitWords(String str) {
        return str.split(" ");
    }
    public static String[] shortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (w.length() < shortest.length()) shortest = w;
            if (w.length() > longest.length()) longest = w;
        }
        return new String[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[] result = shortestLongest(words);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
