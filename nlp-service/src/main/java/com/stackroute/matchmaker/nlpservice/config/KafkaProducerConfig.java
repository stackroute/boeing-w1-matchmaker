package com.stackroute.matchmaker.nlpservice.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.stackroute.matchmaker.nlpservice.model.Search;

public class KafkaProducerConfig {
	
	@Bean
	public Map<String, Object> producerConfig() {
		Map<String, Object> configProp = new HashMap<>();
		// specifies a list of host/port pairs to use for establishing the initial
		// connection to the Kafka cluster
		configProp.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "126.0.0.1:9092");
		// specifies the serializer class for key that implements the
		// org.apache.kafka.common.serialization.Serializer interface.
		configProp.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		// specifies the serializer class for value that implements the
		// org.apache.kafka.common.serialization.Serializer interface.
		configProp.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return configProp;
	}
	
	
	@Bean
	public ProducerFactory<String, Search> producerFactory() {
		return new DefaultKafkaProducerFactory<>(producerConfig());
	}

	@Bean
	public KafkaTemplate<String, Search> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}

}
