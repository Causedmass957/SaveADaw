package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.examples.repositories")
@EntityScan("com.example.models")
@SpringBootApplication
public class SaveADawgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaveADawgApplication.class, args);
	}

}
