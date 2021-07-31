package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Consultorio;
import edu.unah.model.IdConsultorio;

public interface RepositoryConsultorio extends JpaRepository<Consultorio, IdConsultorio>{
	public Consultorio findById(int id);
}
