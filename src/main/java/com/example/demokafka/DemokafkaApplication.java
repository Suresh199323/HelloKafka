package com.example.demokafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableEurekaServer
@SpringBootApplication
public class DemokafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemokafkaApplication.class, args);
	}
}
