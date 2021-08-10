package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Odontologo;

public interface RepositoryOdontologo extends JpaRepository<Odontologo,Integer>{
	public Odontologo findById(int id);
}
