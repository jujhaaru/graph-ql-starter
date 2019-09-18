package com.poc.graphql.dao.entity;

import java.io.Serializable;
import java.time.LocalDate;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String type;
	private String modelCode;
	private String brandName;
	private LocalDate launchDate;

}