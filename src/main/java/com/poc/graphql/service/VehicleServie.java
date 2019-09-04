package com.poc.graphql.service;

import java.util.List;
import java.util.Optional;

import com.poc.graphql.dao.entity.Vehicle;

public interface VehicleServie {

	Optional<Vehicle> getVehicle(int id);

	List<Vehicle> getAllVehicles(int count);

	Vehicle createVehicle(String type, String modelCode, String brandName, String launchDate);

}
