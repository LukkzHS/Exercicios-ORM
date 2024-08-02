package br.iftm.edu.rastreamento.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.iftm.edu.rastreamento.model.Endereco;
import br.iftm.edu.rastreamento.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> findAll() {
        return enderecoService.findAll();
    }

    @PostMapping
    public Endereco save(@RequestBody Endereco endereco) {
        return enderecoService.save(endereco);
    }
}