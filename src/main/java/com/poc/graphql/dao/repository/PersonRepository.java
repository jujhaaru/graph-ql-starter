package com.poc.graphql.dao.repository;


import com.poc.graphql.dao.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PersonRepository extends MongoRepository<Person, Integer> {
}
