package com.majo.webservices.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.majo.webservices")
@EntityScan("com.majo.webservices.entity")
@EnableJpaRepositories("com.majo.webservices.repository")
public class NotesRestAPIApplication {
	public static void main(String[] args) {
		SpringApplication.run(NotesRestAPIApplication.class, args);
	}
}
