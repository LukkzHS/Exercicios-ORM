package main.java.com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demoapplication1.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}