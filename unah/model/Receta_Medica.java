package edu.unah.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Receta_Medica")
public class Receta_Medica {
	
	@Id
	private int Id_Receta;
	
	private String Descripcion;
	private Date Fecha_Actual;
	
	@OneToOne
	@JoinColumn (name="Id_Paciente")
	@JsonBackReference
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn (name="Id_Odontologo")
	@JsonBackReference
	private Odontologo odontologo;
	
	public Receta_Medica() {}

	public Receta_Medica(int id_Receta, String descripcion, Date fecha_Actual, Paciente paciente,
			Odontologo odontologo) {
		super();
		Id_Receta = id_Receta;
		Descripcion = descripcion;
		Fecha_Actual = fecha_Actual;
		this.paciente = paciente;
		this.odontologo = odontologo;
	}

	public int getId_Receta() {
		return Id_Receta;
	}

	public void setId_Receta(int id_Receta) {
		Id_Receta = id_Receta;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Date getFecha_Actual() {
		return Fecha_Actual;
	}

	public void setFecha_Actual(Date fecha_Actual) {
		Fecha_Actual = fecha_Actual;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Odontologo getOdontologo() {
		return odontologo;
	}

	public void setOdontologo(Odontologo odontologo) {
		this.odontologo = odontologo;
	}
	
}
