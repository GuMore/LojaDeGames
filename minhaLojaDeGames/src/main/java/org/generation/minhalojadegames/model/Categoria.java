package org.generation.minhalojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import antlr.collections.List;

@Entity
@Table
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@NotBlank
	@Size(min = 2, max = 20 , message = "O atributo Generro deve ter no min 2 caracteres")
	private String Genero; 
	
	@NotBlank
	@Size(min = 2, max = 20 , message = "O atributo Plataforma deve ter no minimo 2 caracteres")
	private String Plataforma;
	
	private Boolean Multiplayer;
	
	@OneToMany
	@JsonIgnoreProperties("Categoria")
	private List produto;
	
	public List getPostagem() {
		return produto;
	}

	public void setPostagem(List produto) {
		this.produto = produto;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getPlataforma() {
		return Plataforma;
	}

	public void setPlataforma(String plataforma) {
		Plataforma = plataforma;
	}

	public Boolean getMultiplayer() {
		return Multiplayer;
	}

	public void setMultiplayer(Boolean multiplayer) {
		Multiplayer = multiplayer;
	}

}
