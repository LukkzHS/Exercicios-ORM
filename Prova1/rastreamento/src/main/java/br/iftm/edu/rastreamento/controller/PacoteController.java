package br.iftm.edu.rastreamento.controller;

import br.iftm.edu.rastreamento.model.Pacote;
import br.iftm.edu.rastreamento.service.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {

    @Autowired
    private PacoteService pacoteService;

    @GetMapping
    public List<Pacote> findAll() {
        return pacoteService.findAll();
    }

    @PostMapping
    public Pacote save(@RequestBody Pacote pacote) {
        return pacoteService.save(pacote);
    }

    @GetMapping("/{id}")
    public Pacote findById(@PathVariable String id) {
        return pacoteService.findById(id);
    }

    @PutMapping("/{id}")
    public Pacote update(@PathVariable String id, @RequestBody Pacote pacote) {
        pacote.setId(id);
        return pacoteService.save(pacote);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        pacoteService.deleteById(id);
    }
}