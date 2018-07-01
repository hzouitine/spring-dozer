package com.springdozer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("classpath*:dozer.xml")
public class SpringDozerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDozerApplication.class, args);
	}
}
