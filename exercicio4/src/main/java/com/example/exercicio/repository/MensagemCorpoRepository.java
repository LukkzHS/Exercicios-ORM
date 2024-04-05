package com.example.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exercicio.domain.MensagemCorpo;

public interface MensagemCorpoRepository extends JpaRepository<MensagemCorpo, Long> {
}