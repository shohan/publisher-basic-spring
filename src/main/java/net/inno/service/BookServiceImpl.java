package net.inno.service;

import net.inno.domian.Book;
import net.inno.repository.BookRepository;
import net.inno.repository.BookRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookService")
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;


    public BookServiceImpl() {
        System.out.println("BookServiceImpl no args constructor");
    }

    public BookServiceImpl(BookRepository bookRepository) {
        System.out.println("BookServiceImpl  constructor");
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("BookServiceImpl Setter");
        this.bookRepository = bookRepository;
    }
}
