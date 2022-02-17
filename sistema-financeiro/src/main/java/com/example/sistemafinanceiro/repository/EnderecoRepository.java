package com.example.sistemafinanceiro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistemafinanceiro.entities.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
	public List<Endereco> findAllByRuaContainingIgnoreCase (String rua);

}
