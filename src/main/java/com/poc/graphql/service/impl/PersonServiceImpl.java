/**
 * 
 */
package com.poc.graphql.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poc.graphql.dao.entity.Address;
import com.poc.graphql.dao.entity.Person;
import com.poc.graphql.dao.repository.PersonRepository;
import com.poc.graphql.service.PersonService;

/**
 * @author 5256313
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	@Transactional(readOnly = true)
	public Optional<Person> getPerson(int id) {
		return personRepository.findById(id);
	}

	@Override
	public List<Person> getPersons(int count) {

		List<Person> allPeople = new ArrayList<>();
		Iterable<Person> personIterable = this.personRepository.findAll();
		personIterable.forEach(allPeople::add);
		return allPeople;
	}

	public Person writePerson(final String name, final int age, final List<Address> add) {
		Person entity = new Person();
		entity.setAdd(add);
		entity.setName(name);
		entity.setAge(age);
		personRepository.save(entity);
		return entity;
	}

}