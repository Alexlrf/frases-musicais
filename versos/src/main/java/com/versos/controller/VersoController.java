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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.versos.model.dto.VersoDTO;
import com.versos.model.entity.Verso;
import com.versos.model.mapper.VersoMapper;
import com.versos.services.VersoService;

@RestController
@RequestMapping("/verso")
public class VersoController {

	@Autowired
	VersoService versoService;

	@Autowired
	VersoMapper versoMapper;

	@GetMapping("/listaVersos")
	public ResponseEntity<List<Verso>> listaVersos() {
		List<Verso> lista = versoService.listaVersos();
		return ResponseEntity.ok().body(lista);
	}
	
	
	@PostMapping()
	public ResponseEntity<Verso> insertVerso(@Valid @RequestBody VersoDTO versoDTO) throws URISyntaxException {
		Verso novoVerso = versoService.saveVerso(versoMapper.mapVersoDTOtoVerso(versoDTO));
		return ResponseEntity.created(new URI("/verso/cadastraVerso/" + novoVerso.getIdVerso())).body(novoVerso);
	}
	
	@DeleteMapping("/{idVerso}")
	public ResponseEntity<Void> deleteVersoById(@PathVariable Long idVerso){
		versoService.deletaVersoById(idVerso);
		return ResponseEntity.noContent().build();
		
	}

}
