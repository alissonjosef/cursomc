package com.alissonsilva.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alissonsilva.cursomc.domain.Categoria;
import com.alissonsilva.cursomc.repositories.CategoriaRepository;

@Service
public class CateogiraService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) { 
		 Optional<Categoria> obj = repo.findById(id); 
		return obj.orElse(null); 
		} 

}
