package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Sucursal;

public interface RepositorySucursal extends JpaRepository<Sucursal,Integer> {
	public Sucursal findById(int id);
}
