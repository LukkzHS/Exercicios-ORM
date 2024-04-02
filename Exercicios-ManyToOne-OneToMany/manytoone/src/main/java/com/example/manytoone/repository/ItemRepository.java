package com.example.manytoone.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.manytoone.domain.Item;

public interface ItemRepository extends CrudRepository<Item,Long> {
    
}