package com.poc.graphql.service;

import java.util.List;
import java.util.Optional;

import com.poc.graphql.dao.entity.Address;
import com.poc.graphql.dao.entity.Person;
import com.poc.graphql.dao.entity.Vehicle;

public interface PersonService {

	Optional<Person> getPerson(int id);

	List<Person> getPersons(int count);

	Person writePerson(String name, int age, List<Address> add);

}
