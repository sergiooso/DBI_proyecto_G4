package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Empleado;


public interface RepositoryEmpleado extends JpaRepository<Empleado, Integer>{
	public Empleado findById(int id);
	
}