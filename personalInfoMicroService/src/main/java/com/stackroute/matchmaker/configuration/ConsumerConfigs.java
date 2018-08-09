package com.stackroute.matchmaker.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.stackroute.matchmaker.model.PersonalInfo;


/*For consuming messages, we need to configure a ConsumerFactory and a KafkaListenerContainerFactory.
Once these beans are available in spring bean factory, POJO based consumers can be configured using @KafkaListener annotation.
@EnableKafka annotation is required on the configuration class to enable
detection of @KafkaListener annotation on spring managed beans.*/

@Configuration
@EnableKafka
public class ConsumerConfigs {
	
	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		Map<String, Object> props = new HashMap<>();
		//specifies a list of host/port pairs to use for establishing the initial connection to the Kafka cluster
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		//specifies a unique string that identifies the consumer group this consumer belongs to.
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "foo");
		//specifies the serializer class for key that implements the org.apache.kafka.common.serialization.Serializer interface.
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		//specifies the serializer class for value that implements the org.apache.kafka.common.serialization.Serializer interface.
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(props);
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}
	
	@Bean
	public ConsumerFactory<String, PersonalInfo> personalInfoConsumerFactory() {
		Map<String, Object> props = new HashMap<>();
		//specifies a list of host/port pairs to use for establishing the initial connection to the Kafka cluster
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.23.238.163:9092");
		//specifies a unique string that identifies the consumer group this consumer belongs to.
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		//specifies the serializer class for key that implements the org.apache.kafka.common.serialization.Serializer interface.
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		//specifies the serializer class for value that implements the org.apache.kafka.common.serialization.Serializer interface.
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(),new JsonDeserializer<>(PersonalInfo.class));
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, PersonalInfo> personalInfoKafkaContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, PersonalInfo> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(personalInfoConsumerFactory());
		return factory;
	}


}
