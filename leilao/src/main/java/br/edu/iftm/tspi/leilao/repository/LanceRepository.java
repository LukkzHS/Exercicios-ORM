package br.edu.iftm.tspi.leilao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.tspi.leilao.model.Lance;
import java.util.List;


@Repository
public interface LanceRepository extends CrudRepository<Lance, Integer>{
    List<Lance> findByParticipante(Long id);
    List<Lance> findByParticipanteIdAndValorGreaterThan(Long id, Double valor);
}
