package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}