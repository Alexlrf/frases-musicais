package com.versos.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="verso")
public class Verso implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVerso;
	private Long idArtista;
	private String frase;
	private String musica;
	private String album;
	
		
	public Verso(Long idArtista, String frase, String musica, String album) {
		super();
		this.idArtista = idArtista;
		this.frase = frase;
		this.musica = musica;
		this.album = album;
	}

	public Verso() {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVerso == null) ? 0 : idVerso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Verso other = (Verso) obj;
		if (idVerso == null) {
			if (other.idVerso != null)
				return false;
		} else if (!idVerso.equals(other.idVerso))
			return false;
		return true;
	}
		
}
