package com.example.demo.rest;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClientesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClientesRepository repository;
    
    @Autowired
    public ClienteController(ClientesRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public Cliente salvar(Cliente cliente){
        return repository.save(cliente);
    }

}
