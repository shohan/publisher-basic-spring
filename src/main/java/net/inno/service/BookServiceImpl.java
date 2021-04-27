package net.inno.service;

import net.inno.domian.Book;
import net.inno.repository.BookRepository;
import net.inno.repository.BookRepositoryImpl;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
