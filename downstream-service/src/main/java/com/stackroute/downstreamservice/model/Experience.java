package com.stackroute.downstreamservice.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
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

public class Experience {
	@PrimaryKeyColumn(ordinal = 0,type = PrimaryKeyType.PARTITIONED)
	private String profileId;
	@PrimaryKeyColumn(ordinal = 1,type = PrimaryKeyType.PARTITIONED)
    private String organizationName;
    private String role;
    private String startDate;
    private String endDate;
    private String message;
    

}
