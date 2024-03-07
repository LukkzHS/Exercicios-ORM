package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Repository.CustomerRepository;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository) {
		return (args) -> {

			customerRepository.save(new Customer("Cristiano", "Araujo"));
			customerRepository.save(new Customer("Claudia", "Rocha"));
			customerRepository.save(new Customer("Caio", "Araujo"));
			customerRepository.save(new Customer("Greg", "Ferreira"));
			customerRepository.save(new Customer("Gustavo", "Garcia"));

			customerRepository.findAll().forEach(customer -> {
				log.info(customer.toString());
			});
			log.info("");

			Customer customer = customerRepository.findById(1L);
			log.info(customer.toString());
			log.info("");

			customerRepository.findByLastName("Araujo").forEach(bauer -> {
				log.info(bauer.toString());
			});
			log.info("");
		};
	}

}