package com.stackroute.matchmaker.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.fasterxml.jackson.databind.JsonSerializer;


/*In order to successfully send messages to a Kafka topic, 
we need to configure The KafkaTemplate. This configuration is handled by the ProducerConfigs class.
We configure the KafkaTemplate using an implementation of the ProducerFactory more specifically,
the DefaultKafkaProducerFactory. We can initialize this producer factory using a Map<String, Object>.
We can use the keys taken from the ProducerConfig class.
Then we need a KafkaTemplate which wraps a Producer instance and provides
convenience methods for sending messages to Kafka topics.
This configuration is handled by the ProducerConfig class.*/

@Configuration
public class ProducerConfigs {
	
	@Value("${spring.kafka.bootstrap-servers}")
	 private String bootstrapServers;
	
	@Bean
	public Map<String, Object> producerConfig() {
		Map<String, Object> configProps = new HashMap<>();
		//specifies a list of host/port pairs to use for establishing the initial connection to the Kafka cluster
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		//specifies the serializer class for key that implements the org.apache.kafka.common.serialization.Serializer interface.
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		//specifies the serializer class for value that implements the org.apache.kafka.common.serialization.Serializer interface.
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		return configProps;
	}
	
	@Bean
	public ProducerFactory<String, ?> producerFactory() {
		return new DefaultKafkaProducerFactory<>(producerConfig());
	}
	
	@Bean
	public KafkaTemplate<String, ?> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}
	
	

}
