package com.example.manytoone.repository;

import com.example.manytoone.domain.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.manytoone.repository.PostagemRepository;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}