package com.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> books;

    public LibraryManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    // Linear search by title
    public Book findBookByTitleLinear(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title (requires sorted list)
    public Book findBookByTitleBinary(String title) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Book midBook = books.get(mid);
            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    // Sort books by title
    public void sortBooksByTitle() {
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    // Display all books
    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
