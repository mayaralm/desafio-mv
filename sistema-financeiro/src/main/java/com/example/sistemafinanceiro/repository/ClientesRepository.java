package com.example.sistemafinanceiro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistemafinanceiro.entities.Clientes;
@Repository
public interface ClientesRepository extends JpaRepository <Clientes,Long>{
	public List<Clientes> findAllByNomeContainingIgnoreCase (String nome);

}
