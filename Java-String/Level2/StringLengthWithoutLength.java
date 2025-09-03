import java.util.*;

public class StringLengthWithoutLength {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len1 = getLength(input);
        int len2 = input.length();
        System.out.println("Custom Length: " + len1);
        System.out.println("Built-in Length: " + len2);
    }
}
