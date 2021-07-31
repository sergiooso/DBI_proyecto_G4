package edu.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.model.Factura;

public interface RepositoryFactura extends JpaRepository<Factura, Integer>{
	public Factura findById(int id);
}
