package com.poc.graphql.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poc.graphql.dao.entity.Vehicle;
import com.poc.graphql.dao.repository.VehicleRepository;
import com.poc.graphql.service.VehicleServie;

@Service
public class VehicleServiceImpl implements VehicleServie {

	private final VehicleRepository vehicleRepository;

	public VehicleServiceImpl(final VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Vehicle> getVehicle(int id) {
		return vehicleRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Vehicle> getAllVehicles(int count) {
		Iterable<Vehicle> allVars = this.vehicleRepository.findAll();
		List<Vehicle> vehicleList = new ArrayList<>();
		allVars.forEach(vehicleList::add);
		return vehicleList;
	}

	@Transactional
	public Vehicle createVehicle(final String type, final String modelCode, final String brandName,
			final String launchDate) {
		final Vehicle vehicle = new Vehicle();
		vehicle.setType(type);
		vehicle.setModelCode(modelCode);
		vehicle.setBrandName(brandName);
		vehicle.setLaunchDate(LocalDate.parse(launchDate));
		return this.vehicleRepository.save(vehicle);
	}

}
