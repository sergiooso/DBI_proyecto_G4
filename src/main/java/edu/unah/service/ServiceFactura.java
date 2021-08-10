package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.model.Factura;
import edu.unah.repository.RepositoryFactura;

@Service
public class ServiceFactura {
	@Autowired
	RepositoryFactura repositoryFactura;
	
	public void crearFactura(Factura factura) {
		this.repositoryFactura.save(factura);
	}
	
	public List<Factura> obtenerTodasFacturas(){
		return this.repositoryFactura.findAll();
	}
	
	public Factura buscarFactura(int id) {
		return this.repositoryFactura.findById(id);
	}
}
