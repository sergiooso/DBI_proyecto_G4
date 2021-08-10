package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.model.Consulta;
import edu.unah.repository.RepositoryConsulta;


@Service
public class ServiceConsulta {
	@Autowired
	RepositoryConsulta repositoryConsulta;
	
	public void crearConsulta(Consulta consulta) {
		this.repositoryConsulta.save(consulta);
	}
	
	public List<Consulta> obtenerSucursal(){
		return this.repositoryConsulta.findAll();
	}
	
	public Consulta buscarSucursal(int id) {
		return this.repositoryConsulta.findById(id);
	}
}
