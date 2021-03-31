package com.versos.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.versos.model.entity.Artista;
import com.versos.repository.ArtistaRepository;
import com.versos.services.ArtistaService;

@Service
public class ArtistaServicesImpl implements ArtistaService {

	@Autowired
	private ArtistaRepository artistaRepository;

	@Override
	public List<Artista> listaArtistas() {
		return artistaRepository.findAll();
	}

	@Override
	public Artista cadastraArtista(Artista artista) {		
		return artistaRepository.save(artista);
	}

}
