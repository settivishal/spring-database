package com.vishal.spring_database.services;

import com.vishal.spring_database.domain.entities.AuthorEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {

    AuthorEntity createAuthor(AuthorEntity authorEntity);
}
