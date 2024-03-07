package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name; 
    private String lastName;

    protected Customer() {}

    public Customer(String name, String lastName) { 
        this.name = name; 
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, nome='%s', ultimoNome='%s']", 
                id, name, lastName); 
    }

    public Long getId() {
        return id;
    }

    public String getName() { 
        return name; 
    }

    public String getLastName() {
        return lastName;
    }
}
