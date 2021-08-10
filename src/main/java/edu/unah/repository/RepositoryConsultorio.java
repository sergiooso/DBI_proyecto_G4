package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Consultorio;

public interface RepositoryConsultorio extends JpaRepository<Consultorio, Integer>{
	public Consultorio findById(int id);
}
