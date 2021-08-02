package edu.unah.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Tratamiento")
public class Tratamiento {
	
	@Id
	private int Id_Tratamiento;
	private String Nombre;
	private float Precio;
	private Date Fecha_Inicio;

	@ManyToOne
	@JoinColumn (name="Id_Odontologo")
	@JsonBackReference
	private Odontologo odontologo;
	
	@OneToOne(mappedBy="Tratamiento",fetch=FetchType.EAGER)
	private List<Factura> factura;

	public Tratamiento() {}
	
	public Tratamiento(int id_Tratamiento, String nombre, float precio, Date fecha_Inicio, Odontologo odontologo) {
		super();
		Id_Tratamiento = id_Tratamiento;
		Nombre = nombre;
		Precio = precio;
		Fecha_Inicio = fecha_Inicio;
		this.odontologo = odontologo;
	}

	public int getId_Tratamiento() {
		return Id_Tratamiento;
	}

	public void setId_Tratamiento(int id_Tratamiento) {
		Id_Tratamiento = id_Tratamiento;
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

	public Date getFecha_Inicio() {
		return Fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}

	public Odontologo getOdontologo() {
		return odontologo;
	}

	public void setOdontologo(Odontologo odontologo) {
		this.odontologo = odontologo;
	}
	
	
}
