//package com.mangesh.foodordermanagement.kakfa.config;
//
//import org.apache.kafka.clients.admin.NewTopic;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.TopicBuilder;
//
//@Configuration
//public class KafkaTopicConfig {
//	
//
//	  @Value("${spring.kafka.template.default-topic}")	
//	  private String topic;
//
//	@Bean
//	public NewTopic foodNewTopic() {
//		
//		return TopicBuilder.name(topic)
//				           .partitions(4)
//				           .build();
//	}
//
//}
