package edu.unah.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="TBL_CONSULTA")

public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NumConsulta",unique=true)
	private int NumConsulta;
	
	private Date fecha;
	
	@OneToOne
	@JoinColumn(name="IdPaciente")
	@JsonBackReference
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name="IdOdontologo")
	@JsonBackReference
	private Odontologo odontologo;
	
	
	public Consulta() {}

	public Consulta( Date fecha2, Paciente paciente, Odontologo odontologo) {
		super();
	
		this.fecha = fecha2;
		this.paciente = paciente;
		this.odontologo = odontologo;
	}

	public int getNumconsulta() {
		return NumConsulta;
	}

	public void setNumconsulta(int numconsulta) {
		NumConsulta = numconsulta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
