package com.stackroute.matchmaker.configuration;

import java.util.HashMap;
import java.util.Map;

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

import com.stackroute.matchmaker.model.Certificates;

/*For consuming messages, we need to configure a ConsumerFactory and a KafkaListenerContainerFactory.
Once these beans are available in spring bean factory, POJO based consumers can be configured using @KafkaListener annotation.
@EnableKafka annotation is required on the configuration class to enable
detection of @KafkaListener annotation on spring managed beans.*/

@EnableKafka
@Configuration
public class KafkaConsumerConfiguration {


	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;

	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		Map<String, Object> config = new HashMap<>();

		//specifies a list of host/port pairs to use for establishing the initial connection to the Kafka cluster
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers );
		//specifies a unique string that identifies the consumer group this consumer belongs to.
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
		//specifies the serializer class for key that implements the org.apache.kafka.common.serialization.Serializer interface.
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		//specifies the serializer class for value that implements the org.apache.kafka.common.serialization.Serializer interface.
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

		return new DefaultKafkaConsumerFactory<>(config);
	}


	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, Certificates> userConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		//specifies a list of host/port pairs to use for establishing the initial connection to the Kafka cluster
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		//specifies a unique string that identifies the consumer group this consumer belongs to.
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		//specifies the serializer class for key that implements the org.apache.kafka.common.serialization.Serializer interface.
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		//specifies the serializer class for value that implements the org.apache.kafka.common.serialization.Serializer interface.
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(Certificates.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Certificates> userKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, Certificates> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(userConsumerFactory());
		return factory;
	}
}
