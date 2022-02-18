package com.example.sistemafinanceiro.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/new")
	public ResponseEntity<Clientes> post(@RequestBody Clientes clientes){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(clientes));
	}
	@PutMapping("/edit/{id}")
	public ResponseEntity<Clientes> put(@RequestBody Clientes clientes){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(clientes));
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}