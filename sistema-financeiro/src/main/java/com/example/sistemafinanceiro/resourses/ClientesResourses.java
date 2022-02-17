package com.example.sistemafinanceiro.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistemafinanceiro.entities.Clientes;
import com.example.sistemafinanceiro.repository.ClientesRepository;

@RestController
@RequestMapping(value = "/clientes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientesResourses {
	@Autowired
	private ClientesRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Clientes>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Clientes> getById(@PathVariable long id) {
	        return repository.findById(id)
		        .map(resp -> ResponseEntity.ok(resp))
		        .orElse(ResponseEntity.notFound().build());
	}

}