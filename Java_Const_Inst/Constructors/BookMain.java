public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling", 499.99);

        b1.display();
        b2.display();
    }
}
