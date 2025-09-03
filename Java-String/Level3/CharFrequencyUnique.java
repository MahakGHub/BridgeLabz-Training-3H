import java.util.Scanner;

public class CharFrequencyUnique {

    public static char[] uniqueChars(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (sb.indexOf(String.valueOf(text.charAt(i))) == -1) {
                sb.append(text.charAt(i));
            }
        }
        return sb.toString().toCharArray();
    }

    public static void frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueChars(text);
        for (char c : unique) {
            System.out.println(c + " : " + freq[c]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        frequency(text);
        sc.close();
    }
}
