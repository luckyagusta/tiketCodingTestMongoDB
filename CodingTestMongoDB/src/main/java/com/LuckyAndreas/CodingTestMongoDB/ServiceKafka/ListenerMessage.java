package com.LuckyAndreas.CodingTestMongoDB.ServiceKafka;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;

import com.LuckyAndreas.CodingTestMongoDB.Collections.Customers;


public class ListenerMessage {
	
	private CountDownLatch latch = new CountDownLatch(1);
	
	@Value("${message.topic.name}")
    private String kafkaTopic;
	
	  @KafkaListener(topics = "${message.topic.name}")
	    public void receiveCustomer(Customers sm) {
		  latch.countDown();
		 System.out.println(sm.toString());
	    }
	  
	  @KafkaListener(topics = "${message.topic.name}")
	    public void receiveObject(List<Object> obj) {
		  latch.countDown();
		 System.out.println(obj.toString());
	    }
}
