package com.versos.services;

import java.util.List;

import com.versos.model.entity.Artista;

public interface ArtistaService {
	
	public List<Artista> listaArtistas();
	
	public Artista saveArtista(Artista artista);
	
	public Artista finById(Long idArtista);
	
	public List<Artista> findByNomeArtistaContaining(String nomeArtista);
	
	public void updateArtista(Artista artista);
	
	public void deleteArtistaById(Long idArtista);
	

}
