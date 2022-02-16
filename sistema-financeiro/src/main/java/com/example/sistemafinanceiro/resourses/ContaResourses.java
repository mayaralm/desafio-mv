package com.example.sistemafinanceiro.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistemafinanceiro.entities.Conta;

@RestController
@RequestMapping(value = "/contas")
public class ContaResourses {
	@GetMapping
	public ResponseEntity<Conta> findAll(){
		Conta c1 = new Conta(1,123665478, "123456789", "0003987112852679", 0, "Pessoa Fisica");
		return ResponseEntity.ok().body(c1);
	}
}
