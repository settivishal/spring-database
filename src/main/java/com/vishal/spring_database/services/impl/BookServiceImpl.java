package com.vishal.spring_database.services.impl;

import com.vishal.spring_database.domain.entities.BookEntity;
import com.vishal.spring_database.repositories.BookRepository;
import com.vishal.spring_database.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(String isbn, BookEntity book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }
}
