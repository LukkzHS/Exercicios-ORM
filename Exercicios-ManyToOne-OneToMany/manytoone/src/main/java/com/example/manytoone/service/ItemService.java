package com.example.manytoone.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manytoone.domain.Item;
import com.example.manytoone.repository.ItemRepository;

@Service
public class ItemService {

        // A anotação @Autowired é usada para injetar dependências automaticamente.
        // A anotação @Autowired pode ser usada para injetar beans em propriedades, métodos e construtores.
        @Autowired
        ItemRepository repository;

        public List<Item> getAll() {
                try {
                        List<Item> items = new ArrayList<Item>();

                        // O método findAll() retorna um Iterable que é percorrido com o método
                        // forEach() que adiciona cada item à lista items.
                        // O operador :: é usado para criar expressões lambda mais claras e concisas.
                        // A expressão lambda items::add é usada para adicionar cada item retornado pelo
                        // método findAll() à lista items.
                        // A expressão lambda items::add é equivalente a: (item) -> items.add(item)
                        repository.findAll().forEach(items::add);
                        return items;
                } catch (Exception e) {
                        return null;
                }
        }

        public Item getById(Long id) {
                Optional<Item> item = repository.findById(id);
                if (item.isPresent()) {
                        return item.get();
                }
                return null;
        }

        public Item create(Item item) {
                return repository.save(item);
        }

        public Item update(Long id, Item item) {
                Optional<Item> existingItemOptional = repository.findById(id);

                if (existingItemOptional.isPresent()) {
                        Item existingItem = existingItemOptional.get();
                        existingItem.setNome(item.getNome());
                        return repository.save(existingItem);
                } else {
                        return null;
                }
        }

        public boolean delete(Long id) {
                try {
                        repository.deleteById(id);
                        return true;
                } catch (Exception e) {
                        return false;
                }
        }

}