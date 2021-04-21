package com.versos.model.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="artista")
public class Artista implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArtista;
	
	@Column(name="nome_artista")
	private String nomeArtista;
	
	@Column(name="genero_musical")
	private String generoMusical;
	
	@CreationTimestamp
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="data_cadastro")
	private LocalDate dataCadastro;

		
	public Artista(Long idArtista, String nomeArtista, String generoMusical) {
		super();
		this.idArtista = idArtista;
		this.nomeArtista = nomeArtista;
		this.generoMusical = generoMusical;
	}

	public Artista() {
		super();
	}

	public Long getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Long idArtista) {
		this.idArtista = idArtista;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}	
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idArtista == null) ? 0 : idArtista.hashCode());
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
		Artista other = (Artista) obj;
		if (idArtista == null) {
			if (other.idArtista != null)
				return false;
		} else if (!idArtista.equals(other.idArtista))
			return false;
		return true;
	}
		
}
