package com.stackroute.downstreamservice.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*
 * Model for Location
 */
@SuppressWarnings("unused")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table
@JsonIgnoreProperties
public class Location {

	@PrimaryKey
	private String profileId;
	private String address;
	private String city;
	private String pin;
	private String state;
	private String country;
	// private String message;

}
