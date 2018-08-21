package com.stackroute.matchmaker.configuration;

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

import com.stackroute.matchmaker.indexermodel.TrainingIndex;
import com.stackroute.matchmaker.model.Certificates;

@Configuration
public class KakfaProducerConfiguration {

	@Bean
	public ProducerFactory<String, Certificates> producerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.23.238.163:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}

	@Bean
	public KafkaTemplate<String, Certificates> kafkaTemplate() {
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
	public ProducerFactory<String, TrainingIndex> producerFactoryindex1() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.23.238.163:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}

	@Bean
	public KafkaTemplate<String, TrainingIndex> kafkaTemplateIndex1() {
		return new KafkaTemplate<>(producerFactoryindex1());
	}
}
