package com.example.manytoone.service;

import com.example.manytoone.domain.Postagem;
import com.example.manytoone.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostagemService {

    @Autowired
    private PostagemRepository repository;

    public List<Postagem> getAll() {
        return repository.findAll();
    }

    public Postagem getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Postagem create(Postagem postagem) {
        return repository.save(postagem);
    }

    public Postagem update(Long id, Postagem postagem) {
        Postagem existingPostagem = repository.findById(id).orElse(null);
        if (existingPostagem != null) {
            existingPostagem.setTitulo(postagem.getTitulo());
            existingPostagem.setConteudo(postagem.getConteudo());
            return repository.save(existingPostagem);
        }
        return null;
    }

    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}