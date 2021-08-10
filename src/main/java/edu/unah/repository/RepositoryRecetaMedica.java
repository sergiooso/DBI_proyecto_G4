package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.RecetaMedica;

public interface RepositoryRecetaMedica extends JpaRepository<RecetaMedica, Integer>{
	public RecetaMedica findById(int id);
}
