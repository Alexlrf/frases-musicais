package com.versos.config;

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
		
		Artista artista1 = new Artista("Bob Marley", "Reggae");
		Artista artista2 = new Artista("Peter Tosh", "Reggae");
		Artista artista3 = new Artista("Jack Johnson", "Pop-Rock");
		Artista artista4 = new Artista("Bob Dylan", "Folk");
		
		artistaRepository.save(artista1);
		artistaRepository.save(artista2);
		artistaRepository.save(artista3);
		artistaRepository.save(artista4);
		
	}

}
