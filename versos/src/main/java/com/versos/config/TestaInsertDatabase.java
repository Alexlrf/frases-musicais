package com.versos.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.versos.model.entity.Artista;
import com.versos.repository.ArtistaRepository;

@Component
@Profile(value="test")
public class TestaInsertDatabase implements CommandLineRunner{

	@Autowired
	private ArtistaRepository artistaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Artista artista1 = new Artista(null, "Bob Marley", "Reggae");
		Artista artista2 = new Artista(null, "Peter Tosh", "Reggae");
		Artista artista3 = new Artista(null, "Jack Johnson", "Pop-Rock");
		Artista artista4 = new Artista(null, "Bob Dylan", "Folk");
		
		artistaRepository.saveAll(Arrays.asList(artista1, artista2, artista3, artista4));
				
	}

}
