package br.iftm.edu.rastreamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.iftm.edu.rastreamento.model.Endereco;
import br.iftm.edu.rastreamento.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}