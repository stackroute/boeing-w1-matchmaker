package com.stackroute.indexer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.indexer.trail1.nodes.City;
import com.stackroute.indexer.trail1.nodes.LocationListner;
import com.stackroute.indexer.trail1.nodes.ProfileId;
import com.stackroute.indexer.trail1.repositories.CityRepository;
import com.stackroute.indexer.trail1.repositories.ProfileIdRepository;

@Service
public class KafkaConsumer {
	private ProfileIdRepository profileIdRepository;
	private CityRepository cityRepository;

	@Autowired
	public KafkaConsumer(ProfileIdRepository profileIdRepository, CityRepository cityRepository) {
		super();
		this.profileIdRepository = profileIdRepository;
		this.cityRepository = cityRepository;
	}

	@KafkaListener(topics = "String_Boo", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	@KafkaListener(topics = "Kafka_Example_json_location", groupId = "group_json", containerFactory = "locationKafkaListenerFactory")
	public void consumeJson(LocationListner locationListner) {
		System.out.println("Consumed JSON Message: " + locationListner);
		cityRepository.findById(locationListner.getCityName());
		System.out.println(cityRepository.findById(locationListner.getCityName()));
		City city = new City(locationListner.getCityName());
		ProfileId profileId = new ProfileId(locationListner.getProfileId(), city);
		profileIdRepository.save(profileId);
	}

}
