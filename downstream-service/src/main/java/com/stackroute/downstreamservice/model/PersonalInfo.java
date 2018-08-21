package com.stackroute.downstreamservice.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
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
public class PersonalInfo {
	@PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
	private String profileId;
	private String name;
	private String picture;
	private String dob;
	private String age;
	private String gender;
	private String mobile;
	private String email;
	private String facebook;
	private String linkedin;
	private String github;
	private String bloodGroup;

}
