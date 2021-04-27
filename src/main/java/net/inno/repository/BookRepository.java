package net.inno.repository;

import net.inno.domian.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
}
