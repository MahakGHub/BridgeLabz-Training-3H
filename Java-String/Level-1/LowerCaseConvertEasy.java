import java.util.Scanner;

public class LowerCaseConvertEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String text = sc.nextLine();
         String lower = text.toLowerCase();

        System.out.println("Lowercase: " + lower);

        if (text.equalsIgnoreCase(lower)) {
            System.out.println("Both strings are equal ignoring case.");
        } else {
            System.out.println("Strings are different.");
        }
    }
}
