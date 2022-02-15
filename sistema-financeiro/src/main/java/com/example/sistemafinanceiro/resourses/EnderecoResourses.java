package com.example.sistemafinanceiro.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistemafinanceiro.entities.Endereco;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResourses {
	@GetMapping
	public ResponseEntity<Endereco> findAll(){
		Endereco x = new Endereco("rua Maria Emilia", "2017","casa a" ,"593790", "nobre", "camaragibe", "Pe");
		return ResponseEntity.ok().body(x);
		
	}

}
