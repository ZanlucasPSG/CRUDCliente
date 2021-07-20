package com.example.demo;

import com.example.demo.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public CommandLineRunner run(@Autowired DemoApplication repository){
		return args -> {
			Cliente cliente = Cliente.builder().cpf("00000000000").nome("Carlim").build();
			//repository.save(cliente);
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
