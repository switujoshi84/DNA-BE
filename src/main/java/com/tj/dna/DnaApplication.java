package com.tj.dna;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan({"com.tj.dna.services","com.tj.dna.controller","com.tj.dna.serviceimpl","com.tj.dna.*","com.tj.dna.config"})
@EnableJpaRepositories("com.tj.dna.repsitory")
public class DnaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DnaApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
	 return new ModelMapper();
	}
}
