package com.stackroute.experiencemicroservice.appli.config;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
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

@EnableKafka
@Configuration
public class KafkaConsumerConfig {
// Reading normal String Message
   @Bean
   public ConsumerFactory<String, String> consumerFactory() {
       Map<String, Object> config = new HashMap<>();

       config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.23.238.163:9092");  //IP Address goes here
       config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
       config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
       config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

       return new DefaultKafkaConsumerFactory<>(config);
   }


   @Bean
   public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
       ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory();
       factory.setConsumerFactory(consumerFactory());
       return factory;
   }

//Fetching  JSON data required convertions
   @Bean
   public ConsumerFactory<String, Experience> experienceConsumerFactory() {
       Map<String, Object> config = new HashMap<>();

       config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.23.238.163:9092");
       config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
       config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
       config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
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