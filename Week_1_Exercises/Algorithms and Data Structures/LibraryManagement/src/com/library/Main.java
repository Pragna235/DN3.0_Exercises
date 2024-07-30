package com.library;

public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        // Add books
        manager.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        manager.addBook(new Book(2, "1984", "George Orwell"));
        manager.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

        // Display all books
        System.out.println("All Books:");
        manager.displayAllBooks();

        // Sort books by title
        manager.sortBooksByTitle();

        // Search for a book using linear search
        System.out.println("\nSearching for '1984' using linear search:");
        Book book = manager.findBookByTitleLinear("1984");
        System.out.println(book != null ? book : "Book not found.");

        // Search for a book using binary search
        System.out.println("\nSearching for '1984' using binary search:");
        book = manager.findBookByTitleBinary("1984");
        System.out.println(book != null ? book : "Book not found.");
    }
}
