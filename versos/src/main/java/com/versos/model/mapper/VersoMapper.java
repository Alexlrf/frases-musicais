package com.versos.model.mapper;

import org.springframework.stereotype.Service;

import com.versos.model.dto.VersoDTO;
import com.versos.model.entity.Verso;

@Service
public class VersoMapper {
	
	public Verso mapVersoDTOtoVerso(VersoDTO versoDTO) {
		
		Verso verso = new Verso(versoDTO.getIdArtista(), versoDTO.getFrase(), versoDTO.getMusica(), versoDTO.getAlbum());
		return verso;
		
	}
}
