/**
 *
 */
package com.poc.graphql.service.impl;

import com.poc.graphql.dao.entity.Person;
import com.poc.graphql.dao.repository.PersonRepository;
import com.poc.graphql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @
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

    public Person writePerson(final String name, final int age) {
        Person entity = new Person();
        entity.setName(name);
        entity.setAge(age);
        personRepository.save(entity);
        return entity;
    }

}
