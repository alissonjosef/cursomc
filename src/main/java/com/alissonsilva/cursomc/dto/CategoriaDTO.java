package com.alissonsilva.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.alissonsilva.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotEmpty(message = "Prenchimento obrigatorio")
	@Length(min=5, max=80, message = "O tamanho dever ser entre 5 e 80 caracteres")
	private String name;
	
	public CategoriaDTO() {
		
	}
	
public CategoriaDTO(Categoria obj) {
		id= obj.getId();
		name = obj.getName();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
