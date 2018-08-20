package com.stackroute.experiencemicroservice.appli.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.stackroute.experiencemicroservice.appli.model.Experience;

import java.util.HashMap;
import java.util.Map;

/*@EnableKafka annotation is required on the configuration class to
* enable detection of @KafkaListener annotation on spring managed beans.
* We need to configure a ConsumerFactory and a KafkaListenerContainerFactory.
* Once these beans are available in spring bean factory,
* POJO based consumers can be configured using @KafkaListener annotation.
*/
@EnableKafka
@Configuration
public class KafkaConsumerConfig {

	/*
	 * @EnableKafka annotation is required on the configuration class to enable
	 * detection of @KafkaListener annotation on spring managed beans. We need to
	 * configure a ConsumerFactory and a KafkaListenerContainerFactory. Once these
	 * beans are available in spring bean factory, POJO based consumers can be
	 * configured using @KafkaListener annotation.
	 */
	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;
	@Value("${spring.kafka.consumer.group-id}")
	private String group_id;

	// Configuration for Reading normal String Message
	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers); // IP Address goes here
		config.put(ConsumerConfig.GROUP_ID_CONFIG, group_id);
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		config.put(JsonDeserializer.TRUSTED_PACKAGES, "com.stackroute.experiencemicroservice.appli.model");
		return new DefaultKafkaConsumerFactory<>(config);
	}

	/*
	 * @EnableKafka annotation is required on the configuration class to enable
	 * detection of @KafkaListener annotation on spring managed beans. We need to
	 * configure a ConsumerFactory and a KafkaListenerContainerFactory. Once these
	 * beans are available in spring bean factory, POJO based consumers can be
	 * configured using @KafkaListener annotation.
	 */

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}

	// This method is for setting up the configuration when the value to be
	// recieved is a JSON object
	// Configuration for reading or fetching JSON format data
	@Bean
	public ConsumerFactory<String, Experience> experienceConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, group_id);
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

		config.put(JsonDeserializer.TRUSTED_PACKAGES, "com.stackroute.experiencemicroservice.appli.model");
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(Experience.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Experience> experienceKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, Experience> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(experienceConsumerFactory());
		return factory;
	}

}