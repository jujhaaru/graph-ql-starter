package com.poc.graphql.service;

import com.poc.graphql.dao.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Optional<Person> getPerson(int id);

    List<Person> getPersons(int count);

    Person writePerson(String name, int age);

}
