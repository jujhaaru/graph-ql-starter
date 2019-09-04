package com.poc.graphql.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode
@NoArgsConstructor
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@JoinColumn(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ManyToOne
	private Person person;
	
	@Column(name = "street_name")
	private String streetName;

	@Column(name = "house_No")
	private String houseNumber;


}
