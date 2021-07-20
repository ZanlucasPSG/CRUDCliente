package com.example.demo.repository;

import com.example.demo.entity.Cliente;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Cliente,Integer> {

}
