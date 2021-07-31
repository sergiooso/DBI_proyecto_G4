package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.model.Expediente;
import edu.unah.repository.RepositoryExpediente;

@Service
public class ServiceExpediente {
	@Autowired
	RepositoryExpediente repositoryExpediente;
	
	public void crearConsulta(Expediente expediente) {
		this.repositoryExpediente.save(expediente);
	}
	
	public List<Expediente> obtenerExpedientes(){
		return this.repositoryExpediente.findAll();
	}
	
	public Expediente buscarExpediente(int id) {
		return this.repositoryExpediente.findById(id);
	}

}
