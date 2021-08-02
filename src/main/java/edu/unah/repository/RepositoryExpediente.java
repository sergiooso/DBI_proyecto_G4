package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Expediente;

public interface RepositoryExpediente extends JpaRepository<Expediente, Integer>{
	public Expediente findById(int id);
}
