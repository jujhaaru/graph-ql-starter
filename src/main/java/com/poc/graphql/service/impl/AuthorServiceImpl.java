package com.poc.graphql.service.impl;

import com.poc.graphql.dao.entity.Author;
import com.poc.graphql.dao.repository.AuthorRepository;
import com.poc.graphql.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired(required = true)
    private AuthorRepository authorRepository;

    @Override
    public Optional<Author> checkAuthor(String id) {
        return authorRepository.findById(id);
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }
}
