package com.poc.graphql.service;

import com.poc.graphql.dao.entity.Author;

import java.util.Optional;

public interface AuthorService {
    Optional<Author> checkAuthor(String id);

    Author addAuthor(Author author);
}
