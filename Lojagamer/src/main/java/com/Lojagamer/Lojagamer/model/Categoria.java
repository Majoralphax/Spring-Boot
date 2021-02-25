package com.Lojagamer.Lojagamer.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import antlr.collections.List;


@Entity
public class Categoria {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcategoria;
	
	@NotNull
	private String jogos;
	
	

	public Categoria() {
		
	}


	private String idjogo;


	public Long getIdcategoria() {
		return idcategoria;
	}


	public void setIdcategoria(Long idcategoria) {
		this.idcategoria = idcategoria;
	}


	public String getIdjogo() {
		return getIdjogo();
	}


	public void setIdjogo(String idjogo) {
		this.idjogo = idjogo;
	}


	

	}
	
	
	
	
	
	



