package com.poc.graphql.service.impl;

import com.poc.graphql.dao.entity.Vehicle;
import com.poc.graphql.dao.repository.VehicleRepository;
import com.poc.graphql.service.VehicleServie;
import com.poc.graphql.utilities.NextSequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleServie {


    @Autowired(required = true)
    private VehicleRepository vehicleRepository;

    @Autowired(required = true)
    private NextSequenceService nextSequence;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
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
        vehicle.setId(nextSequence.getNextSequences("vehicleSequence"));
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(launchDate);
        return this.vehicleRepository.save(vehicle);
    }

}
