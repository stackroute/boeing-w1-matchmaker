package com.stackroute.matchmaker.test;
//package com.stackroute.consumer.test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.*;
//
//import java.util.Map;
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.LinkedBlockingQueue;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.junit.After;
//import org.junit.BeforeClass;
//import org.junit.ClassRule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.listener.KafkaMessageListenerContainer;
//import org.springframework.kafka.listener.MessageListener;
//import org.springframework.kafka.listener.config.ContainerProperties;
//import org.springframework.kafka.test.rule.KafkaEmbedded;
//import org.springframework.kafka.test.utils.ContainerTestUtils;
//import org.springframework.kafka.test.utils.KafkaTestUtils;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.stackroute.kafka.consumer.indexer.Indexer;
//import com.stackroute.kafka.consumer.listener.Producer;
//import com.stackroute.kafka.consumer.model.Training;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@DirtiesContext
//public class ProducerTest {
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(ProducerTest.class);
//
//	private static String SENDER_TOPIC = "sender.t";
//
//	@Autowired
//	private Producer producer;
//
//	private static KafkaMessageListenerContainer<String, Object> container;
//
//	private static BlockingQueue<ConsumerRecord<String, Object>> records;
//
//	@ClassRule
//	public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, SENDER_TOPIC);
//
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		Map<String, Object> consumerProperties =
//				KafkaTestUtils.consumerProps("producer", "false", embeddedKafka);
//
//		DefaultKafkaConsumerFactory<String, Object> consumerFactory =
//				new DefaultKafkaConsumerFactory<String, Object>(consumerProperties);
//
//		ContainerProperties containerProperties = new ContainerProperties(SENDER_TOPIC);
//
//		container = new KafkaMessageListenerContainer<>(consumerFactory, containerProperties);
//
//		records = new LinkedBlockingQueue<>();
//
//		container.setupMessageListener(new MessageListener<String, Object>() {
//			@Override
//			public void onMessage(ConsumerRecord<String, Object> record) {
//				LOGGER.debug("test-listener received message='{}'", record.toString());
//				records.add(record);
//			}
//		});
//
//		container.start();
//
//		ContainerTestUtils.waitForAssignment(container, embeddedKafka.getPartitionsPerTopic());
//	}
//
//	@After
//	public void tearDown() {
//		// stop the container
//		container.stop();
//	}
//
//	@Test
//	public void test() {
//		
//	   Training train = new Training("asd","asd","asd","asd","asd","asd");
//	   producer.post("asd");
//
//	    // check that the message was received
//	    ConsumerRecord<String, Object> received = records.poll(10, TimeUnit.SECONDS);
//	    // Hamcrest Matchers to check the value
//	    assertThat(received, post("asd"));
//	    // AssertJ Condition to check the key
//	    assertThat(received).has(key(null));
//	  }
//		
//	
//
//}
