package com.versos.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.versos.model.dto.ArtistaDTO;
import com.versos.model.entity.Artista;
import com.versos.model.mapper.ArtistaMapper;
import com.versos.services.ArtistaService;

@RestController
@RequestMapping("/frases")
public class ArtistaController {

	@Autowired
	private ArtistaService artistaService;
	
	@Autowired
	private ArtistaMapper artistaMapper; 

	@GetMapping("/listaArtistas")
	public ResponseEntity<List<Artista>> findAll() {
		List<Artista> lista = artistaService.listaArtistas();
		return ResponseEntity.ok().body(lista);
	}

	@PostMapping("/cadastraArtista")	
	public ResponseEntity<Artista> insert(
			@Valid @RequestBody ArtistaDTO artistaDTO) throws URISyntaxException {
		Artista novoArtista = artistaService.cadastraArtista(artistaMapper.mapArtistaDTOtoArtista(artistaDTO));
		
		return ResponseEntity.created(new URI("/frases/cadastraArtista/" + novoArtista.getIdArtista()))
					.body(novoArtista);
		
	}

}
