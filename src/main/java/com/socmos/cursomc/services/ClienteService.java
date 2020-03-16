package com.socmos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socmos.cursomc.domain.Cliente;
import com.socmos.cursomc.expection.ObjectNotFoundException;
import com.socmos.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
	private ClienteRepository repo;
    
    public Cliente find(Integer id) {
    	Optional<Cliente> obj = repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException(
    	"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    	}

}
