import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {

  static void generateException(String[] names) {
    System.out.println(names[names.length]);
  }

  static void handleException(String[] names) {
    try {
      System.out.println(names[names.length]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Caught ArrayIndexOutOfBoundsException!");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] names = { "Mahak", "Anu", "Ritu" };

    handleException(names);
  }
}
