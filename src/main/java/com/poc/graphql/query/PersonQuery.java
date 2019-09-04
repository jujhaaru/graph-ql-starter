package com.poc.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.poc.graphql.dao.entity.Person;
import com.poc.graphql.service.PersonService;

@Component
public class PersonQuery implements GraphQLQueryResolver {

	@Autowired
	private PersonService personService;

	public List<Person> getPersons(final int count) {
		return this.personService.getPersons(count);
	}

	public Optional<Person> getPerson(final int id) {
		return this.personService.getPerson(id);
	}

}
