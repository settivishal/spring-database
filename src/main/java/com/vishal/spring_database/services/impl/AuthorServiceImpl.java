package com.vishal.spring_database.services.impl;

import com.vishal.spring_database.domain.entities.AuthorEntity;
import com.vishal.spring_database.repositories.AuthorRepository;
import com.vishal.spring_database.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
