package com.poc.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.poc.graphql.dao.entity.Person;
import com.poc.graphql.service.PersonService;

@Component
public class PersonMutation implements GraphQLMutationResolver {

	@Autowired
	private PersonService personService;

	public Person writePerson(final String name, final int age) {
		return this.personService.writePerson(name, age);
	}

}
