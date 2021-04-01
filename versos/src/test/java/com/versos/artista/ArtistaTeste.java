package com.versos.artista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.versos.model.entity.Artista;


class ArtistaTeste {
	
	
	@Test
	void test() {
//		fail("Not yet implemented");
	}
	
	@Test
	void testaArtistaNaoVazio() {
		Artista artista = new Artista();
		assertNotNull(artista);
	}
	
	@Test
	void testaNomeArtista() {
		Artista artista = new Artista();
				
		Assertions.assertNotEquals(" ", artista.getNomeArtista());
		Assertions.assertNotEquals("", artista.getNomeArtista());
				
	}
	
	@Test
	void testaGeneroMusical() {
		Artista artista = new Artista();
				
		Assertions.assertNotEquals(" ", artista.getGeneroMusical());
		Assertions.assertNotEquals("", artista.getGeneroMusical());
				
	}
	
	@Test
	void testaDataCadastro() {
		Artista artista = new Artista();
								
		Assertions.assertNotEquals(" ", artista.getDataCadastro());
		Assertions.assertNotEquals("", artista.getDataCadastro());		
		
		LocalDate data = LocalDate.now();
		LocalDate dataCadastro = artista.getDataCadastro();
					
		int res = data.compareTo(dataCadastro);
		
		System.out.println(res);	
		
	}

}
