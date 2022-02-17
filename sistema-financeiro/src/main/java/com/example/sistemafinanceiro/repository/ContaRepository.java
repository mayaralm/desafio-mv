package com.example.sistemafinanceiro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistemafinanceiro.entities.Conta;
@Repository
public interface ContaRepository extends JpaRepository<Conta,Long> {
	public List<Conta> findAllByNumeroContainingIgnoreCase(String numero);

}
