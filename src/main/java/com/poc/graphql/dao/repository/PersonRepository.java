package com.poc.graphql.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.poc.graphql.dao.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
