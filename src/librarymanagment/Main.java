package librarymanagment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "1986", "Orwell", true));
        bookList.add(new Book(2, "Spin Dictators", "Guriev", true));
        bookList.add(new Book(3, "Thinking Java", "Eckel", false));
        bookList.add(new Book(4, "Fluent Python", "Ramalho", true));
        bookList.add(new Book(5, "SQL Quickstart Guide", "Shields", false));

        for (Book book: bookList) {
            System.out.println(book);
        }

        System.out.println("\nBook \"Spin Dictators has been chosen by someone\"\n");

        for (Book book: bookList) {
            book.borrowBook();
        }

        Book borrowed = bookList.get(1);
        System.out.println("\n" + borrowed);
        System.out.println(borrowed + "\n");

        for (Book book: bookList) {
            book.borrowBook();
        }
    }
}