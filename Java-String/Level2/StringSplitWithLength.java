import java.util.*;

public class StringSplitWithLength {
    public static String[] splitWords(String str) {
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) if (str.charAt(i) == ' ') wordCount++;
        String[] words = new String[wordCount];
        int start = 0, idx = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[idx++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = str.substring(start);
        return words;
    }
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] arr = wordWithLength(words);
        for (String[] row : arr) System.out.println(row[0] + " " + row[1]);
    }
}
