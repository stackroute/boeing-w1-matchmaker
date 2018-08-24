package com.stackroute.matchmaker.test;
//package com.stackroute.consumer.test;
//
//import static org.junit.Assert.*;
//
//import java.util.Map;
//
//import org.junit.BeforeClass;
//import org.junit.ClassRule;
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//import org.springframework.kafka.listener.MessageListenerContainer;
//import org.springframework.kafka.test.rule.KafkaEmbedded;
//import org.springframework.kafka.test.utils.ContainerTestUtils;
//import org.springframework.kafka.test.utils.KafkaTestUtils;
//
//import com.stackroute.kafka.consumer.listener.Consumer;
//import com.stackroute.kafka.consumer.model.Training;
//
//public class ConsumerTest {
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerTest.class);
//
//	private static String RECEIVER_TOPIC = "training";
//
//	@Autowired
//	private Consumer consumer;
//
//	private static KafkaTemplate<String, Object> template;
//
//	@Autowired
//	private static KafkaListenerEndpointRegistry kafkaListenerEndpointRegistry;
//	
//	@ClassRule
//	public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, RECEIVER_TOPIC);
//
//
//
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		
//		Map<String, Object> senderProperties =
//		        KafkaTestUtils.senderProps(embeddedKafka.getBrokersAsString());
//		
//		ProducerFactory<String, Object> producerFactory =
//		        new DefaultKafkaProducerFactory<String, Object>(senderProperties);
//		
//		template = new KafkaTemplate<>(producerFactory);
//
//		template.setDefaultTopic(RECEIVER_TOPIC);
//		
//		  for (MessageListenerContainer messageListenerContainer : kafkaListenerEndpointRegistry
//			        .getListenerContainers()) {
//			      ContainerTestUtils.waitForAssignment(messageListenerContainer,
//			          embeddedKafka.getPartitionsPerTopic());
//			    }
//
//	}
//
//	@Test
//	public void test() {
//		
//		Training train = new Training("asd","asd","asd","asd","asd","asd");
//		template.sendDefault(train);
//	    LOGGER.debug("test-sender sent message='{}'", train);
//	    
//	    consumer.receiveJson(train);
//	}
//
//}
