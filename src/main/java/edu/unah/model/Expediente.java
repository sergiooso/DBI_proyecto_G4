package edu.unah.model;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="TBL_EXPEDIENTE")
public class Expediente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdExpediente",unique=true)
	private int IdExpediente;
	
	private String Descripcion;
	private Date Fecha_Inicio;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="IdPaciente")
	@JsonBackReference
	private Paciente paciente;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="IdOdontologo")
	@JsonBackReference
	private Odontologo odontologo;
	
	public Expediente() {}

	public Expediente(String descripcion, Date fecha_Inicio, Paciente paciente,
			Odontologo odontologo) {
		super();
		
		Descripcion = descripcion;
		this.Fecha_Inicio = fecha_Inicio;
		this.paciente = paciente;
		this.odontologo = odontologo;
	}

	public int getIdExpediente() {
		return IdExpediente;
	}

	public void setIdExpediente(int idExpediente) {
		IdExpediente = idExpediente;
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
