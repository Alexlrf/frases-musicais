package com.versos.services.impl;

import java.util.List;

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
	public Verso saveVerso(Verso verso) {
		verso.setIdVerso(null);
		return versoRepository.save(verso);
	}

	@Override
	public void deletaVersoById(Long idVerso) {
		versoRepository.deleteById(idVerso);
		
	}	

}
