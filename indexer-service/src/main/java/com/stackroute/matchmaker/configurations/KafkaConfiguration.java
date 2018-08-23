package com.stackroute.matchmaker.configurations;

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

import com.stackroute.matchmaker.indexermodel.ExperienceIndex;
import com.stackroute.matchmaker.indexermodel.LocationIndex;
import com.stackroute.matchmaker.indexermodel.ProjectIndex;
import com.stackroute.matchmaker.indexermodel.QualificationIndex;
import com.stackroute.matchmaker.indexermodel.SkillIndex;
import com.stackroute.matchmaker.indexermodel.TrainingIndex;

@EnableKafka
@Configuration
public class KafkaConfiguration {
    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
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
	public ConsumerFactory<String, LocationIndex> locationConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(LocationIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, LocationIndex> locationKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, LocationIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(locationConsumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, TrainingIndex> trainingConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(TrainingIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, TrainingIndex> trainingKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, TrainingIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(trainingConsumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, ExperienceIndex> experienceConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(ExperienceIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, ExperienceIndex> experienceKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, ExperienceIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(experienceConsumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, QualificationIndex> qualificationConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(QualificationIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, QualificationIndex> qualificationKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, QualificationIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(qualificationConsumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, ProjectIndex> projectConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(ProjectIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, ProjectIndex> projectKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, ProjectIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(projectConsumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, SkillIndex> skillConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(SkillIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, SkillIndex> skillKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, SkillIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(skillConsumerFactory());
		return factory;
	}

}
