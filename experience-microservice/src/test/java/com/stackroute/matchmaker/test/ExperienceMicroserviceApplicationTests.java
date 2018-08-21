package com.stackroute.matchmaker.test;
//package com.stackroute.experiencemicroservice.test;
//
//import org.junit.ClassRule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.kafka.test.rule.KafkaEmbedded;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.stackroute.experiencemicroservice.appli.controller.KafkaProducerController;
//import com.stackroute.experiencemicroservice.appli.indexermodel.Indexer;
//import com.stackroute.experiencemicroservice.appli.listener.KafkaConsumer;
//
//@SpringBootTest
//public class ExperienceMicroserviceApplicationTests {
//	private static final String producer = "Experience";
//	@ClassRule
//	public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, producer);
//	  @Autowired
//	  private KafkaConsumer consumer;
//	  @Autowired
//	  private Indexer indexer;
//
//	  @Autowired
//	  private KafkaProducerController sender;
////	@Test
////	public void contextLoads() {
////	}
//	  @Test
//	  public void testReceive() throws Exception {
////  sender.send(producer,indexer);
//	    
//
//
//
//}
//}
