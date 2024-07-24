package br.edu.iftm.tspi.leilao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.tspi.leilao.model.ItemDeLeilao;

@Repository
public interface ItemDeLeilaoRepository extends CrudRepository<ItemDeLeilao, Long>{
    
}
