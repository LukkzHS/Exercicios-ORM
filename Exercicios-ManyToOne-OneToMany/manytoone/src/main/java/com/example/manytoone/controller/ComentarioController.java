package com.example.manytoone.controller;

import com.example.manytoone.domain.Comentario;
import com.example.manytoone.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    ComentarioService service;

    @GetMapping
    public List<Comentario> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public Comentario getById(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Comentario create(@RequestBody Comentario item) {
        return service.create(item);
    }

    @PutMapping("{id}")
    public Comentario update(@PathVariable("id") Long id, @RequestBody Comentario item) {
        return service.update(id, item);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}