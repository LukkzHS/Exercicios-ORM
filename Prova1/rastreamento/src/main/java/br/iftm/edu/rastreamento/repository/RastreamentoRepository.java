package br.iftm.edu.rastreamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.iftm.edu.rastreamento.model.Rastreamento;

@Repository
public interface RastreamentoRepository extends JpaRepository<Rastreamento, Long> {
    List<Rastreamento> findByPacoteId(String pacoteId);
}