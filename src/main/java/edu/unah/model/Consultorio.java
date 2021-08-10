package edu.unah.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="TBL_CONSULTORIO")
public class Consultorio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int NumConsultorio;
	
	private String NombreConsultorio;
	private String Ubicacion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="IdSucursal")
	@JsonBackReference
	private Sucursal sucursal;
	
	public Consultorio() {}

	public Consultorio(int numConsultorio, String nombreConsultorio, String ubicacion, Sucursal sucursal) {
		super();
		NumConsultorio = numConsultorio;
		NombreConsultorio = nombreConsultorio;
		Ubicacion = ubicacion;
		this.sucursal = sucursal;
	}

	public int getNumConsultorio() {
		return NumConsultorio;
	}

	public void setNumConsultorio(int numConsultorio) {
		NumConsultorio = numConsultorio;
	}
	public String getNombreConsultorio() {
		return NombreConsultorio;
	}

	public void setNombreConsultorio(String nombreConsultorio) {
		NombreConsultorio = nombreConsultorio;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
}
