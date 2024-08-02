package br.iftm.edu.rastreamento.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.iftm.edu.rastreamento.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {}
