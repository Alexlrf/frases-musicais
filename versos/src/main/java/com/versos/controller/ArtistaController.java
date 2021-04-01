package com.versos.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.versos.model.dto.ArtistaDTO;
import com.versos.model.entity.Artista;
import com.versos.model.mapper.ArtistaMapper;
import com.versos.services.ArtistaService;

@RestController
@RequestMapping("/artista")
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

	@GetMapping("/{idArtista}")
	public ResponseEntity<Artista> findArtistaById(@PathVariable Long idArtista) {
		Artista artista = artistaService.finById(idArtista);
		return ResponseEntity.ok().body(artista);

	}

	@GetMapping("/nomeArtista")
	public ResponseEntity<List<Artista>> findArtistaByNome(@RequestParam String nomeArtista) {
		List<Artista> artistas = artistaService.findByNomeArtistaContaining(nomeArtista);
		return ResponseEntity.ok().body(artistas);

	}

	@PostMapping
	public ResponseEntity<Artista> insertArtista(@Valid @RequestBody ArtistaDTO artistaDTO) throws URISyntaxException {
		Artista novoArtista = artistaService.saveArtista(artistaMapper.mapArtistaDTOtoArtista(artistaDTO));
		return ResponseEntity.created(new URI("/frases/cadastraArtista/" + novoArtista.getIdArtista()))
				.body(novoArtista);

	}

	@PutMapping("/{idArtista}")
	public ResponseEntity<Artista> updateArtista(@Valid @RequestBody ArtistaDTO artistaDTO,	@PathVariable Long idArtista)
				throws URISyntaxException {
		Artista novoArtista = artistaMapper.mapArtistaDTOtoArtista(artistaDTO);
		novoArtista.setIdArtista(idArtista);
		artistaService.updateArtista(novoArtista);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/{idArtista}")
	public ResponseEntity<Void> deleteArtistaById(@PathVariable Long idArtista)
				throws URISyntaxException {		
		artistaService.deleteArtistaById(idArtista);
		return ResponseEntity.noContent().build();
	}

}
