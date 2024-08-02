package br.iftm.edu.rastreamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.iftm.edu.rastreamento.model.Endereco;
import br.iftm.edu.rastreamento.model.Pacote;
import br.iftm.edu.rastreamento.repository.EnderecoRepository;
import br.iftm.edu.rastreamento.repository.PacoteRepository;
import jakarta.transaction.Transactional;

@Service
public class PacoteService {

    @Autowired
    private PacoteRepository pacoteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Pacote> findAll() {
        return pacoteRepository.findAll();
    }

    @Transactional
    public Pacote save(Pacote pacote) {
        Endereco endereco = pacote.getEndereco();
        if (endereco != null && endereco.getId() == null) {
            enderecoRepository.save(endereco);
        }
        return pacoteRepository.save(pacote);
    }

    public Pacote findById(String id) {
        return pacoteRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        pacoteRepository.deleteById(id);
    }
}