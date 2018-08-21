package com.stackroute.downstreamservice.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("unused")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table
@JsonIgnoreProperties
public class Skills {
	// @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)

	@PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String profileId;
	@PrimaryKeyColumn(ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private String skill;
	private String level;
	private String noOfMonths;
	private String furtherUsage;
	// aprivate String message;

}
