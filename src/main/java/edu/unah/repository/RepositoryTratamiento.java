package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Tratamiento;

public interface RepositoryTratamiento extends JpaRepository<Tratamiento, Integer>{
	
	public Tratamiento findById(int id);

}
