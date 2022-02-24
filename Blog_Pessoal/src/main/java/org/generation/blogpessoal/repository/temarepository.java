package org.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.generation.blogpessoal.model.Tema;

public interface temarepository extends JpaRepository <Tema, Long> {
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
