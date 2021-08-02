package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.unah.model.Tratamiento;
import edu.unah.repository.RepositoryTratamiento;

public class ServiceTratamiento {
	@Autowired
	RepositoryTratamiento repositoryTratamiento;
	
	public void crearTratamiento(Tratamiento tratamiento) {
		this.repositoryTratamiento.save(tratamiento);
	}
	
	public List<Tratamiento> obtenerTratamiento(){
		return this.repositoryTratamiento.findAll();
	}
	
	public Tratamiento buscarTratamiento(int id) {
		return this.repositoryTratamiento.findById(id);
	}
}
