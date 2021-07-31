package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.unah.model.Consultorio;
import edu.unah.model.IdConsultorio;
import edu.unah.repository.RepositoryConsultorio;

public class ServiceConsultorio {
	@Autowired
	RepositoryConsultorio repositoryConsultorio;
	
	public void crearConsultorio(Consultorio consultorio) {
		this.repositoryConsultorio.save(consultorio);
	}
	
	public List<Consultorio> obtenerConsultorio(){
		return this.repositoryConsultorio.findAll();
	}
	
	public Consultorio buscarConsultorio(IdConsultorio consultorioId) {
		return this.repositoryConsultorio.getById(consultorioId); //Verificar si funciona con getById, sino usar .getOne(consultorioId)
	}
}
