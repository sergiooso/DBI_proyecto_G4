package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Receta_Medica;

public interface RepositoryReceta_Medica extends JpaRepository<Receta_Medica, Integer>{
	public Receta_Medica findById(int id);
}
