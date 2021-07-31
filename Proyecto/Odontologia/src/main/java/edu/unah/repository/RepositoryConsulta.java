package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Consulta;

public interface RepositoryConsulta extends JpaRepository<Consulta, Integer>{
	public Consulta findById(int id);
}
