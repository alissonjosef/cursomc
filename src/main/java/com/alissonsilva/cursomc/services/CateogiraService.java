package com.alissonsilva.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.alissonsilva.cursomc.domain.Categoria;
import com.alissonsilva.cursomc.repositories.CategoriaRepository;
import com.alissonsilva.cursomc.services.exceptions.DataIntegretyException;
import com.alissonsilva.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CateogiraService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegretyException("Não e possivel excluir uma categoria que possui produtos");
		}
	}
}
