package com.vishal.spring_database.services;

import com.vishal.spring_database.domain.entities.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);

    List<BookEntity> findAll();
}
