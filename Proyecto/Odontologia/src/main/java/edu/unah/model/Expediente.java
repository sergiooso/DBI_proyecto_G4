package edu.unah.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Expediente")
public class Expediente {

	@Id
	private int Id_Expediente;
	
	private String Descripcion;
	private Date Fecha_Inicio;
	
	@OneToOne
	@JoinColumn(name="Id_Paciente")
	@JsonBackReference
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name="Id_Odontologo")
	@JsonBackReference
	private Odontologo odontologo;
	
	public Expediente() {}
	
	public Expediente(int id_Expediente, String descripcion, Date fecha_Inicio, Paciente paciente,
			Odontologo odontologo) {
		super();
		Id_Expediente = id_Expediente;
		Descripcion = descripcion;
		Fecha_Inicio = fecha_Inicio;
		this.paciente = paciente;
		this.odontologo = odontologo;
	}

	public int getId_Expediente() {
		return Id_Expediente;
	}

	public void setId_Expediente(int id_Expediente) {
		Id_Expediente = id_Expediente;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Date getFecha_Inicio() {
		return Fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
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
