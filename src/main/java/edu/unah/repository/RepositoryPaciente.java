package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Paciente;

public interface RepositoryPaciente extends JpaRepository<Paciente,Integer>{
	public Paciente findById(int id);
}
