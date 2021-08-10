package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.model.Consultorio;
import edu.unah.repository.RepositoryConsultorio;

@Service
public class ServiceConsultorio {
	@Autowired
	RepositoryConsultorio repositoryConsultorio;
	
	public void crearConsultorio(Consultorio consultorio) {
		this.repositoryConsultorio.save(consultorio);
	}
	
	public List<Consultorio> obtenerTodasConsultorio(){
		return this.repositoryConsultorio.findAll();
	}
	
	public Consultorio buscarConsultorio(int id) {
		return this.repositoryConsultorio.findById(id);
	}
	
}
