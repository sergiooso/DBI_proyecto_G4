package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.model.Odontologo;
import edu.unah.repository.RepositoryOdontologo;

@Service
public class ServiceOdontologo {
	@Autowired
	RepositoryOdontologo repositoryOdontologo;
	
	public void crearOdontologo(Odontologo odontologo) {
		this.repositoryOdontologo.save(odontologo);
	}
	
	public List<Odontologo> obtenerOdontologos(){
		return this.repositoryOdontologo.findAll();
	}
	
	public Odontologo buscarOdontologo(int id) {
		return this.repositoryOdontologo.findById(id);
	}
}
