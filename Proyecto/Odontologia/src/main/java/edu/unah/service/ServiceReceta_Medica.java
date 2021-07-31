package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.unah.model.Receta_Medica;
import edu.unah.repository.RepositoryReceta_Medica;

public class ServiceReceta_Medica {
	@Autowired
	RepositoryReceta_Medica repositoryReceta_Medica;
	
	public void crearReceta(Receta_Medica receta) {
		this.repositoryReceta_Medica.save(receta);
	}
	
	public List<Receta_Medica> obtenerRecetas(){
		return this.repositoryReceta_Medica.findAll();
	}
	
	public Receta_Medica buscarReceta_Medica(int id) {
		return this.repositoryReceta_Medica.findById(id);
	}
}
