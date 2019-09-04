package com.poc.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.poc.graphql.dao.entity.Vehicle;
import com.poc.graphql.service.VehicleServie;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

	@Autowired
	private VehicleServie vehicleService;

	public List<Vehicle> getVehicles(final int count) {
		return this.vehicleService.getAllVehicles(count);
	}

	public Optional<Vehicle> getVehicle(final int id) {
		return this.vehicleService.getVehicle(id);
	}

}
