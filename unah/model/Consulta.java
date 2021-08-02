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
@Table(name="Consulta")
public class Consulta {
	@Id
	private int num_consulta;
	
	private Date fecha;
	
	@OneToOne
	@JoinColumn(name="Id_Paciente")
	@JsonBackReference
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name="Id_Odontologo")
	@JsonBackReference
	private Odontologo odontologo;
	
	public Consulta() {}

	public Consulta(int num_consulta, Date fecha, Paciente paciente, Odontologo odontologo) {
		super();
		this.num_consulta = num_consulta;
		this.fecha = fecha;
		this.paciente = paciente;
		this.odontologo = odontologo;
	}

	public int getNum_consulta() {
		return num_consulta;
	}

	public void setNum_consulta(int num_consulta) {
		this.num_consulta = num_consulta;
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
