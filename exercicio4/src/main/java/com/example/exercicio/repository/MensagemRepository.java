package com.example.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exercicio.domain.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}