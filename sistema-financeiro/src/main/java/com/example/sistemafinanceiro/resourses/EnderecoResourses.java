package com.example.sistemafinanceiro.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistemafinanceiro.entities.Endereco;
import com.example.sistemafinanceiro.repository.EnderecoRepository;

@RestController
@RequestMapping(value = "/enderecos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EnderecoResourses {
	@Autowired
	private EnderecoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Endereco> getById(@PathVariable long id) {
	        return repository.findById(id)
		        .map(resp -> ResponseEntity.ok(resp))
		        .orElse(ResponseEntity.notFound().build());
	}

}
