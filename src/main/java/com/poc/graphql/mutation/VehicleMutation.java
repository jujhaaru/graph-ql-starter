package com.poc.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.poc.graphql.dao.entity.Vehicle;
import com.poc.graphql.service.VehicleServie;

@Component
public class VehicleMutation implements GraphQLMutationResolver{

	@Autowired
	private VehicleServie vehService;
	
	
	 public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
	        return this.vehService.createVehicle(type, modelCode, brandName, launchDate);
	    }
	
}
