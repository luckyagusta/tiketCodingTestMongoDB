package com.LuckyAndreas.CodingTestMongoDB.ServiceKafka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.LuckyAndreas.CodingTestMongoDB.Collections.Customers;

@EnableKafka
@Configuration
public class KafkaListenerConfig {

	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;

	@Bean
	public Map<String, Object> consumerConfigs() {
		Map<String, Object> props = new HashMap<>();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "tiket");
		return props;
	}
	
	@Bean
	public ConsumerFactory<String, List<Object>> consumerFactory() {
		return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(), new JsonDeserializer<>());
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, List<Object>> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, List<Object>> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());

		return factory;
	}
	
/*
 * Custom Consumer Pojo
 * 
 */

	@Bean
	public ConsumerFactory<String, Customers> customerconsumerFactory() {
		return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(),
				new JsonDeserializer<>(Customers.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Customers> customerskafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, Customers> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(customerconsumerFactory());

		return factory;
	}

	

}
