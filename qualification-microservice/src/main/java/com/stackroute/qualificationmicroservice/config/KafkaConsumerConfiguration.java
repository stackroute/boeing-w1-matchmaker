package com.stackroute.qualificationmicroservice.config;

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

import com.stackroute.qualificationmicroservice.model.Qualification;

import java.util.HashMap;
import java.util.Map;

/* @EnableKafka annotation is required on the configuration class to
 * enable detection of @KafkaListener annotation on spring managed beans.
 * We need to configure a ConsumerFactory and a KafkaListenerContainerFactory. 
 * Once these beans are available in spring bean factory,
 * POJO based consumers can be configured using @KafkaListener annotation.
 */
@EnableKafka
@Configuration
public class KafkaConsumerConfiguration {

	 /* Configuration Properties which mentions the IP Address,group Id's
	  *  for the messages to be exchanged.The VALUE_DESERIALIZER_CLASS_CONFIG
	  *  is set to the Deserializer type of the message to be received
	  */
    
	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;
	
	@Value("{$spring.kafka.consumer.group-id}")
	private String groupid;
	
    
    @Bean
    public ConsumerFactory<String, String> consumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        config.put(ConsumerConfig.GROUP_ID_CONFIG, groupid);
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        return new DefaultKafkaConsumerFactory<>(config);
    }

    /* The containerFactory identifies the KafkaListenerContainerFactory,
     * to use to build the Kafka listener container. The factory listener object is 
     * set with the configuration values 
     */
    
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
    
    
    /* This method is for setting up the configuration when the value to be received is a JSON object 
     * 
     */
    @Bean
    public ConsumerFactory<String,Qualification> qualificationConsumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        config.put(ConsumerConfig.GROUP_ID_CONFIG,groupid);
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(Qualification.class));
    }
    

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Qualification> qualificationKafkaListenerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, Qualification> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(qualificationConsumerFactory());
        return factory;
    }

   

}
