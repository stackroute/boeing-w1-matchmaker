package com.stackroute.matchmaker.test.consumer;
//package com.stackroute.experiencemicroservice.test.consumer;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Before;
//import org.junit.ClassRule;
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//import org.springframework.kafka.listener.MessageListenerContainer;
//import org.springframework.kafka.test.rule.KafkaEmbedded;
//import org.springframework.kafka.test.utils.ContainerTestUtils;
//import org.springframework.kafka.test.utils.KafkaTestUtils;
//import org.springframework.test.annotation.DirtiesContext;
//
//import com.stackroute.experiencemicroservice.appli.listener.KafkaConsumer;
//import com.stackroute.experiencemicroservice.appli.model.Experience;
//@SpringBootTest
//@DirtiesContext
//public class ConsumerTest {
//	 public Experience experience = new Experience("as","asd","asd","asd","asd","asd");
//
//	    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerTest.class);
//
//	    private static String experienceproducer = "Experience";
//	    private KafkaTemplate<String, Experience> template;
//
//	    @Autowired
//	    public KafkaConsumer kafkaConsumer;
//
//	    @Autowired
//	    private KafkaListenerEndpointRegistry kafkaListenerEndpointRegistry;
//
//	    @ClassRule
//	    public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, experienceproducer);
//
//	    @Before
//	    public void setUp() throws Exception {
//	        // set up the Kafka producer properties
//	        Map<String, Object> senderProperties = KafkaTestUtils.senderProps(embeddedKafka.getBrokersAsString());
//
//	        // create a Kafka producer factory
//	        ProducerFactory<String, Experience> producerFactory = new DefaultKafkaProducerFactory<>(senderProperties);
//
//	        // create a Kafka template
//	        template = new KafkaTemplate<String, Experience>(producerFactory);
//	        // set the default topic to send to
//	        template.setDefaultTopic(experienceproducer);
//
//	        // wait until the partitions are assigned
//	        for (MessageListenerContainer messageListenerContainer : kafkaListenerEndpointRegistry
//	                .getListenerContainers()) {
//	            ContainerTestUtils.waitForAssignment(messageListenerContainer, embeddedKafka.getPartitionsPerTopic());
//	        }
//	    }
//
//	    @Test
//	    public void testReceive() throws Exception {
//	        // send the message
//	        Experience greeting = experience;
//	        template.sendDefault(greeting);
//	        LOGGER.debug("test-sender sent message='{}'", greeting);
//
//	        kafkaConsumer.getLatch().await(10000, TimeUnit.MILLISECONDS);
//
//	        // check that the message was received
//	        assertThat(kafkaConsumer.getLatch().getCount()).isEqualTo(0);
//	    }
//}
