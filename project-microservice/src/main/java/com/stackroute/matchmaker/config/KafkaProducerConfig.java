package com.stackroute.matchmaker.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.stackroute.matchmaker.indexermodel.ProjectIndex;

@Configuration
public class KafkaProducerConfig {

	@Bean
	public Map<String, Object> producerConfig() {
		Map<String, Object> configProps = new HashMap<>();
		// specifies a list of host/port pairs to use for establishing the initial
		// connection to the Kafka cluster
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.23.238.163:9092");
		// specifies the serializer class for key that implements the
		// org.apache.kafka.common.serialization.Serializer interface.
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		// specifies the serializer class for value that implements the
		// org.apache.kafka.common.serialization.Serializer interface.
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return configProps;
	}

	@Bean
	public ProducerFactory<String, ProjectIndex> producerFactory() {
		return new DefaultKafkaProducerFactory<>(producerConfig());
	}

	@Bean
	public KafkaTemplate<String, ProjectIndex> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}

}
