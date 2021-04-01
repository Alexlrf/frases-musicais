package com.versos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.versos.model.entity.Artista;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long>{
	
	List<Artista> findByNomeArtistaContaining(String nomeArtista);

}
