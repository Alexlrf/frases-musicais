package com.versos.services.impl;

import java.util.List;
import java.util.Optional;

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
	public Artista saveArtista(Artista artista) {
		artista.setIdArtista(null);
		return artistaRepository.save(artista);
	}

	@Override
	public Artista finById(Long idArtista) {		
		Optional<Artista> artista = artistaRepository.findById(idArtista);		
		return artista.orElse(null);
	}

	@Override
	public List<Artista> findByNomeArtistaContaining(String nomeArtista) {
		return artistaRepository.findByNomeArtistaContaining(nomeArtista);
	}

	@Override
	public void updateArtista(Artista artista) {
		Artista artistaAtual = this.finById(artista.getIdArtista());
		artistaAtual.setNomeArtista(artista.getNomeArtista());
		artistaAtual.setGeneroMusical(artista.getGeneroMusical());
		artistaAtual.setDataCadastro(artista.getDataCadastro());		
		artistaRepository.save(artistaAtual);
	}

	@Override
	public void deleteArtistaById(Long idArtista) {
		artistaRepository.deleteById(idArtista);
		
	}

}
