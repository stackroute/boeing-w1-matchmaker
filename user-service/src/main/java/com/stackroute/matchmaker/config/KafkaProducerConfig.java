package com.stackroute.matchmaker.config;

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

import com.stackroute.matchmaker.model.AcademicQualification;
import com.stackroute.matchmaker.model.Certificates;
import com.stackroute.matchmaker.model.Experience;
import com.stackroute.matchmaker.model.Location;
import com.stackroute.matchmaker.model.PersonalInfo;
import com.stackroute.matchmaker.model.Projects;
import com.stackroute.matchmaker.model.Skills;


@Configuration
public class KafkaProducerConfig {
	@Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return props;
    }

    @Bean
    public ProducerFactory<String, Experience> producerFactory1() {
        return new DefaultKafkaProducerFactory<String, Experience>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Experience> kafkaTemplate1() {
        return new KafkaTemplate<>(producerFactory1());
    }


    @Bean
    public ProducerFactory<String, Skills> producerFactory2() {
        return new DefaultKafkaProducerFactory<String, Skills>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Skills> kafkaTemplate2() {
        return new KafkaTemplate<>(producerFactory2());
    }
    
    @Bean
    public ProducerFactory<String, PersonalInfo> producerFactory3() {
        return new DefaultKafkaProducerFactory<String, PersonalInfo>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, PersonalInfo> kafkaTemplate3() {
        return new KafkaTemplate<>(producerFactory3());
    }
    
    @Bean
    public ProducerFactory<String, Location> producerFactory4() {
        return new DefaultKafkaProducerFactory<String, Location>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Location> kafkaTemplate4() {
        return new KafkaTemplate<>(producerFactory4());
    }
    
    @Bean
    public ProducerFactory<String, Projects> producerFactory5() {
        return new DefaultKafkaProducerFactory<String,Projects>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Projects> kafkaTemplate5() {
        return new KafkaTemplate<>(producerFactory5());
    }
    
    @Bean
    public ProducerFactory<String, AcademicQualification> producerFactory6() {
        return new DefaultKafkaProducerFactory<String, AcademicQualification>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, AcademicQualification> kafkaTemplate6() {
        return new KafkaTemplate<>(producerFactory6());
    }
    
    @Bean
    public ProducerFactory<String, Certificates> producerFactory7() {
        return new DefaultKafkaProducerFactory<String, Certificates>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Certificates> kafkaTemplate7() {
        return new KafkaTemplate<>(producerFactory7());
    }
}



