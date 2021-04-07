package com.versos.model.dto;

import java.io.Serializable;

public class VersoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idVerso;
	private Long idArtista;
	private String frase;
	private String musica;
	private String album;
	
	public VersoDTO(Long idVerso, Long idArtista, String frase, String musica, String album) {
		super();
		this.idVerso = idVerso;
		this.idArtista = idArtista;
		this.frase = frase;
		this.musica = musica;
		this.album = album;
	}

	public VersoDTO() {
		super();
	}

	public Long getIdVerso() {
		return idVerso;
	}

	public void setIdVerso(Long idVerso) {
		this.idVerso = idVerso;
	}

	public Long getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Long idArtista) {
		this.idArtista = idArtista;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
}
