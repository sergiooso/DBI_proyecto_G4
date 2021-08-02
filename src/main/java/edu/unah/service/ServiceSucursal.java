package edu.unah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.unah.model.Sucursal;
import edu.unah.repository.RepositorySucursal;

public class ServiceSucursal {
	@Autowired
	RepositorySucursal repositorySucursal;
	
	public void crearSucursal(Sucursal sucursal) {
		this.repositorySucursal.save(sucursal);
	}
	
	public List<Sucursal> obtenerSucursal(){
		return this.repositorySucursal.findAll();
	}
	
	public Sucursal buscarSucursal(int id) {
		return this.repositorySucursal.findById(id);
	}
}
