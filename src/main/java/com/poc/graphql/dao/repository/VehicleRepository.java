package com.poc.graphql.dao.repository;


import com.poc.graphql.dao.entity.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle, Integer> {

}
