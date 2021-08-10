package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.model.Tratamiento;
import edu.unah.repository.RepositoryTratamiento;

@Service
public class ServiceTratamiento {
	@Autowired 
	RepositoryTratamiento repositoryTratamiento;
	
	public void crearTratamiento(Tratamiento tratamiento) {
		this.repositoryTratamiento.save(tratamiento);
	}
	
	public List<Tratamiento> obtenerTodasTratamiento(){
		return this.repositoryTratamiento.findAll();
	}
	
	public Tratamiento buscarTratamiento(int id) {
		return this.repositoryTratamiento.findById(id);
	}

}
