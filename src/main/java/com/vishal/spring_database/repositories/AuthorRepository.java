package com.vishal.spring_database.repositories;

import com.vishal.spring_database.domain.entities.AuthorEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, String> {
    Iterable<AuthorEntity> ageLessThan(int age);

    @Query("SELECT a from Author a where a.age > ?1")
    Iterable<AuthorEntity> findAuthorsWithAgeGreaterThan(int age);
}
