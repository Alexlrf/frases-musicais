package com.versos.model.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class ArtistaDTO implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private Long idArtista;	

	@NotNull(message = "Campo nome não pode ser nulo")
	@NotEmpty(message = "Campo nome não pode ser vazio")
	@Size(max = 50)
	private String nomeArtista;	
	
	@NotBlank(message = "Campo nome não pode estar em branco")
	@Size(max = 30)
	private String generoMusical;
	
	public ArtistaDTO() {
	
	}

	public ArtistaDTO(Long idArtista, String nomeArtista, String generoMusical) {
		super();
		this.idArtista = idArtista;
		this.nomeArtista = nomeArtista;
		this.generoMusical = generoMusical;
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
	
	
}
