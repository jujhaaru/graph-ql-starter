package com.poc.graphql.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.poc.graphql.dao.entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
