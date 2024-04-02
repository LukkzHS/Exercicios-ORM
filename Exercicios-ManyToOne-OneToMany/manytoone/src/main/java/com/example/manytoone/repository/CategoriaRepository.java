package com.example.manytoone.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.manytoone.domain.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria,Long> {
    
}