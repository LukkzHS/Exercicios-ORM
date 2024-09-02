package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.repository.CustomerRepository;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    private static final String EMPTY_STRING = "";
    private static final String ARAUJO = "Araujo"; // SONARLINT S1192

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository) {
        // SONARLINT 1611
		return args -> {

            customerRepository.save(new Customer("Cristiano", ARAUJO));
            customerRepository.save(new Customer("Claudia", "Rocha"));
            customerRepository.save(new Customer("Caio", ARAUJO));
            customerRepository.save(new Customer("Greg", "Ferreira"));
            customerRepository.save(new Customer("Gustavo", "Garcia"));

            // SONARLINT S1602 && S2629 
            if (log.isInfoEnabled()) {
                customerRepository.findAll().forEach(customer -> log.info(customer.toString()));
            
            Customer customer = customerRepository.findById(1L);
            log.info(customer.toString());
            log.info(EMPTY_STRING);

            customerRepository.findByLastName(ARAUJO).forEach(bauer -> log.info(bauer.toString()));
            log.info(EMPTY_STRING);
            
            }
        };
    }
}
