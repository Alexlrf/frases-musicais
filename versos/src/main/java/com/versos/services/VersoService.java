package com.versos.services;

import java.util.List;

import com.versos.model.entity.Verso;

public interface VersoService {
	
	public List<Verso> listaVersos();
	
	public Verso findById(Long idVerso);
	
	public Verso saveVerso(Verso verso);
	
	public void updateVerso(Verso verso);
	
	public void deletaVersoById(Long idVerso);

}
