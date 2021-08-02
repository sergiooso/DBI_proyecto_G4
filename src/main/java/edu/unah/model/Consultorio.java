package edu.unah.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="Consultorio")
@IdClass(IdConsultorio.class)
public class Consultorio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int Num_Consultorio;
	@Id
	private Sucursal Id_sucursal;
	private String Nombre_Consultorio;
	private String Ubicacion;
	
	public Consultorio() {}

	public Consultorio(int num_Consultorio, Sucursal id_sucursal, String nombre_Consultorio, String ubicacion) {
		super();
		Num_Consultorio = num_Consultorio;
		Id_sucursal = id_sucursal;
		Nombre_Consultorio = nombre_Consultorio;
		Ubicacion = ubicacion;
	}
	
	@ManyToOne
	@JoinColumn(name="Id_Sucursal", referencedColumnName="Id_Sucursal", insertable = false, updatable = false)
	@JsonBackReference
	private Sucursal sucursal;

	public int getNum_Consultorio() {
		return Num_Consultorio;
	}

	public void setNum_Consultorio(int num_Consultorio) {
		Num_Consultorio = num_Consultorio;
	}

	public Sucursal getId_sucursal() {
		return Id_sucursal;
	}

	public void setId_sucursal(Sucursal id_sucursal) {
		Id_sucursal = id_sucursal;
	}

	public String getNombre_Consultorio() {
		return Nombre_Consultorio;
	}

	public void setNombre_Consultorio(String nombre_Consultorio) {
		Nombre_Consultorio = nombre_Consultorio;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	
}
