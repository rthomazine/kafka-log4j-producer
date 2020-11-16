package com.github.rthomazine.kafkalog4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class KafkaLog4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaLog4jApplication.class, args);
	}

}
