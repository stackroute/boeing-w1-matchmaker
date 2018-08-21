package com.stackroute.kafka.locationconsumer.config;

import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.stackroute.kafka.locationconsumer.indexermodel.Index;
/*import com.stackroute.kafka.locationconsumer.indexermodel.Indexer;*/

@Configuration
public class KafkaProducerConfiguration {

	@Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;
	
	//producer factory for producer configuration 
    @Bean
    public ProducerFactory<String, Index> producerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(config);
    }

    //injecting configuration/producer config to template  
    @Bean
    public KafkaTemplate<String, Index> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}
