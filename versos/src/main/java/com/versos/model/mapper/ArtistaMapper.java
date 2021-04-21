package com.versos.model.mapper;

import org.springframework.stereotype.Service;

import com.versos.model.dto.ArtistaDTO;
import com.versos.model.entity.Artista;

@Service
public class ArtistaMapper {
	
	public Artista mapArtistaDTOtoArtista(ArtistaDTO artistaDTO) {
		
		Artista artista = new Artista(null, artistaDTO.getNomeArtista(), artistaDTO.getGeneroMusical());
		return artista;
	}

}
