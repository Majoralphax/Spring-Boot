package org.generation.blogPessoalGeneration.repository;

import java.util.List;

import org.generation.blogPessoalGeneration.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase (String descricao);
	

}
