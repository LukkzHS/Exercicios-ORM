package com.example.manytoone.service;

import com.example.manytoone.domain.Comentario;
import com.example.manytoone.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository repository;

    public List<Comentario> getAll() {
        return repository.findAll();
    }

    public Comentario getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Comentario create(Comentario comentario) {
        return repository.save(comentario);
    }

    public Comentario update(Long id, Comentario comentario) {
        return repository.findById(id).map(existingComentario -> {
            existingComentario.setTexto(comentario.getTexto());
            existingComentario.setPostagem(comentario.getPostagem());
            return repository.save(existingComentario);
        }).orElse(null);
    }

    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}