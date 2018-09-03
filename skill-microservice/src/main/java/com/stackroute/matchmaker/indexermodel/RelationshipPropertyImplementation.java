package com.stackroute.matchmaker.indexermodel;

import org.springframework.stereotype.Service;

@Service
public class RelationshipPropertyImplementation {

	public String weightageAssigner(String skill) {

		String weightage;
		switch (skill) {
		case "html":
			weightage = "5";
			break;
		case "css":
			weightage = "5";
			break;
		case "angular":
			weightage = "20";
			break;
		case "javascript":
			weightage = "10";
			break;
		case "bootstrap":
			weightage = "10";
			break;
		case "typescript":
			weightage = "15";
			break;
		case "junit":
			weightage = "5";
			break;
		case "gradle":
			weightage = "10";
			break;
		case "mockito":
			weightage = "10";
			break;
		case "java":
			weightage = "10";
			break;
		case "spring":
			weightage = "20";
			break;
		case "c#":
			weightage = "10";
			break;
		case ".net":
			weightage = "20";
			break;
		case "python":
			weightage = "10";
			break;
		case "c++":
			weightage = "25";
			break;
		case "cassandra":
			weightage = "15";
			break;
		case "mongodb":
			weightage = "20";
			break;
		case "neo4j":
			weightage = "25";
			break;
		case "sql":
			weightage = "5";
			break;
		default:
			weightage = "5";
			break;
		}
		return weightage;
	}
}