package com.tj.dna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@ComponentScan({"com.tj.dna.services","com.tj.dna.controller","com.tj.dna.serviceimpl"})
@EnableJpaRepositories("com.tj.dna.repsitory")
public class DnaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DnaApplication.class, args);
	}

}
