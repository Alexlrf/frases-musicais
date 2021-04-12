package com.versos.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.versos.model.entity.Verso;
import com.versos.repository.VersoRepository;
import com.versos.services.VersoService;

@Service
public class VersoServicesImpl implements VersoService{
	
	@Autowired
	private VersoRepository versoRepository;

	@Override
	public List<Verso> listaVersos() {		
		return versoRepository.findAll();
	}
	
	@Override
	public Verso findById(Long idVerso) {
		Optional<Verso> verso = versoRepository.findById(idVerso);
		return verso.orElse(null);
	}	

	@Override
	public Verso saveVerso(Verso verso) {
		verso.setIdVerso(null);
		return versoRepository.save(verso);
	}

	@Override
	public void deletaVersoById(Long idVerso) {
		versoRepository.deleteById(idVerso);
		
	}

	@Override
	public void updateVerso(Verso verso) {
		Verso versoNovo = this.findById(verso.getIdVerso());
		versoNovo.setIdArtista(verso.getIdArtista());
		versoNovo.setFrase(verso.getFrase());
		versoNovo.setMusica(verso.getMusica());
		versoNovo.setAlbum(verso.getAlbum());
		versoRepository.save(versoNovo);
		
	}
		

}
