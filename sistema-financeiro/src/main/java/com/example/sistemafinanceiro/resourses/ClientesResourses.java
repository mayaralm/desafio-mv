package com.example.sistemafinanceiro.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistemafinanceiro.entities.Clientes;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesResourses {
	@GetMapping
	public ResponseEntity<Clientes> findAll(){
		Clientes x = new Clientes(1, "ana", "rua Maria Emilia", "ana@email.com", "999999",125668121, "21548721", "544545484454548");
				return ResponseEntity.ok().body(x);
		
	}

}