import java.util.*;

public class StringSplitCompare {
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
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) if (!arr1[i].equals(arr2[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] custom = splitWords(input);
        String[] builtin = input.split(" ");
        System.out.println(compareArrays(custom, builtin));
    }
}
