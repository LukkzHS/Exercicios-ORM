package br.iftm.edu.rastreamento.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.iftm.edu.rastreamento.model.Rastreamento;
import br.iftm.edu.rastreamento.repository.RastreamentoRepository;
import java.util.List;


@Service
public class RastreamentoService {

    @Autowired
    private RastreamentoRepository rastreamentoRepository;

    public List<Rastreamento> findByPacoteId(String id) {
        return rastreamentoRepository.findByPacoteId(id);
    }

    public Rastreamento save(Rastreamento rastreamento) {
        return rastreamentoRepository.save(rastreamento);
    }
    
}