package com.versos.services;

import java.util.List;

import com.versos.model.entity.Artista;

public interface ArtistaService {
	
	public List<Artista> listaArtistas();
	
	public Artista cadastraArtista(Artista artista);

}
