package com.socmos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socmos.cursomc.domain.Categoria;
import com.socmos.cursomc.expection.ObjectNotFoundException;
import com.socmos.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
	private CategoriaRepository repo;
    
    public Categoria find(Integer id) {
    	Optional<Categoria> obj = repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException(
    	"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    	}

}
