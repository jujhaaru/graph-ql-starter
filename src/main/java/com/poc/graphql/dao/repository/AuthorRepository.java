package com.poc.graphql.dao.repository;

import com.poc.graphql.dao.entity.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
