package com.poc.graphql.dao.repository;

import com.poc.graphql.dao.entity.Language;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepo extends MongoRepository<Language,String> {
}
