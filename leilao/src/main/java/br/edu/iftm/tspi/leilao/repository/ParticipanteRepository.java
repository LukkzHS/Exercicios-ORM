package br.edu.iftm.tspi.leilao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.tspi.leilao.model.Participante;

@Repository
public interface ParticipanteRepository extends CrudRepository<Participante, Integer>{
    
}