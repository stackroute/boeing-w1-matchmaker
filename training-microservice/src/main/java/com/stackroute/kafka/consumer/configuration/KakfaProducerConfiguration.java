package com.stackroute.kafka.consumer.configuration;

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

//import com.stackroute.kafka.consumer.indexer.Indexer;
import com.stackroute.kafka.consumer.indexer.Indexer1;
import com.stackroute.kafka.consumer.model.Training;

@Configuration
public class KakfaProducerConfiguration {

	@Bean
	public ProducerFactory<String, Training> producerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}

	@Bean
	public KafkaTemplate<String, Training> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}

//	@Bean
//	public ProducerFactory<String, Indexer> producerFactoryindex() {
//		Map<String, Object> config = new HashMap<>();
//
//		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//
//		return new DefaultKafkaProducerFactory<>(config);
//	}
//
//	@Bean
//	public KafkaTemplate<String, Indexer> kafkaTemplateIndex() {
//		return new KafkaTemplate<>(producerFactoryindex());
//	}

	@Bean
	public ProducerFactory<String, Indexer1> producerFactoryindex1() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}

	@Bean
	public KafkaTemplate<String, Indexer1> kafkaTemplateIndex1() {
		return new KafkaTemplate<>(producerFactoryindex1());
	}
}
