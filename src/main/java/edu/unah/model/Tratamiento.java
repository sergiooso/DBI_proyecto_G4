package edu.unah.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="TBL_TRATAMIENTO")

public class Tratamiento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdTratamiento",unique=true)
	private int IdTratamiento;
	
	private String Nombre;
	private float Precio;
	private LocalDate Fecha_Inicio;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IdOdontologo")
	@JsonBackReference
	private Odontologo odontologo;

	public Tratamiento(int idTratamiento, String nombre, float precio, LocalDate fecha_Inicio, Odontologo odontologo) {
		super();
		IdTratamiento = idTratamiento;
		Nombre = nombre;
		Precio = precio;
		Fecha_Inicio = fecha_Inicio;
		this.odontologo = odontologo;
	}

	public int getIdTratamiento() {
		return IdTratamiento;
	}

	public void setIdTratamiento(int idTratamiento) {
		IdTratamiento = idTratamiento;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

	public LocalDate getFecha_Inicio() {
		return Fecha_Inicio;
	}

	public void setFecha_Inicio(LocalDate fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}

	public Odontologo getOdontologo() {
		return odontologo;
	}

	public void setOdontologo(Odontologo odontologo) {
		this.odontologo = odontologo;
	}
	
		
}
