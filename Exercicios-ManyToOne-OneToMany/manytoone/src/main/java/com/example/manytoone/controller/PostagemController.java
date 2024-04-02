package com.example.manytoone.controller;

import com.example.manytoone.domain.Postagem;
import com.example.manytoone.service.PostagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

    @Autowired
    PostagemService service;

    @GetMapping
    public List<Postagem> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public Postagem getById(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Postagem create(@RequestBody Postagem item) {
        return service.create(item);
    }

    @PutMapping("{id}")
    public Postagem update(@PathVariable("id") Long id, @RequestBody Postagem item) {
        return service.update(id, item);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}