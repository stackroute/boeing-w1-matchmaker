package com.stackroute.kafka.consumer.configuration;

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

import com.stackroute.kafka.consumer.model.User;

@EnableKafka
@Configuration
public class KafkaConsumerConfiguration {

	
	@Bean
    public ConsumerFactory<String, String> consumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
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
	    public ConsumerFactory<String, User> userConsumerFactory() {
	        Map<String, Object> config = new HashMap<>();

	        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.23.238.163:9092");
	        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
	        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
	        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
	                new JsonDeserializer<>(User.class));
	    }

	    @Bean
	    public ConcurrentKafkaListenerContainerFactory<String, User> userKafkaListenerFactory() {
	        ConcurrentKafkaListenerContainerFactory<String, User> factory = new ConcurrentKafkaListenerContainerFactory<>();
	        factory.setConsumerFactory(userConsumerFactory());
	        return factory;
	    }
}
