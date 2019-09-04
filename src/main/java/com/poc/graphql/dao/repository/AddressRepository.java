package com.poc.graphql.dao.repository;

import org.springframework.data.repository.CrudRepository;
import com.poc.graphql.dao.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
