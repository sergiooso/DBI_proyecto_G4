package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.model.RecetaMedica;
import edu.unah.repository.RepositoryRecetaMedica;

@Service
public class ServiceRecetaMedica {
	@Autowired
	RepositoryRecetaMedica repositoryRecetaMedica;
	
	public void crearReceta(RecetaMedica recetaMedica) {
		this.repositoryRecetaMedica.save(recetaMedica);
	}
	
	public List<RecetaMedica> obtenerTodasRecetas(){
		return this.repositoryRecetaMedica.findAll();
	}
	
	public RecetaMedica buscarReceta(int id) {
		return this.repositoryRecetaMedica.findById(id);
	}
}
