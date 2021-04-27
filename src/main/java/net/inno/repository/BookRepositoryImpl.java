package net.inno.repository;

import net.inno.domian.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        Book book = new Book();
        book.setTitle("Spring");

        books.add(book);
        return books;
    }

}
