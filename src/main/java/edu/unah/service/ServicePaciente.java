package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.model.Paciente;
import edu.unah.repository.RepositoryPaciente;

@Service
public class ServicePaciente {
	
	@Autowired
	RepositoryPaciente repositoryPaciente;
	
	public void crearPaciente(Paciente paciente) {
		this.repositoryPaciente.save(paciente);
	}
	
	public List<Paciente> obtenerPaciente(){
		return this.repositoryPaciente.findAll();
	}
	public Paciente buscarPaciente(int id) {
		return this.repositoryPaciente.findById(id);
	}
}
