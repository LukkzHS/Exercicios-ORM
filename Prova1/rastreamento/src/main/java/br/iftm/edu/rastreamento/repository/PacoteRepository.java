package br.iftm.edu.rastreamento.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.iftm.edu.rastreamento.model.Pacote;

@Repository
public interface PacoteRepository extends JpaRepository<Pacote, String> {}
