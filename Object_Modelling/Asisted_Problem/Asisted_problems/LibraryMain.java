package com.gla.oops;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Basics", "Mahak Gupta");
        Book b2 = new Book("OOP Concepts", "John Doe");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.showBooks();
    }
}
