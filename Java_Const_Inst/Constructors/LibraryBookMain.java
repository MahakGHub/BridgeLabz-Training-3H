public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("DSA in Java", "Striver", 799.99);

        b1.display();
        b1.borrowBook();
        b1.display();
    }
}
