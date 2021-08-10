package edu.unah.model;


import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name="TBL_RECETA_MEDICA")
public class RecetaMedica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdReceta",unique=true)
	private int IdReceta;
	
	private String Descripcion;
	private Date Fecha_Actual;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IdPaciente")
	@JsonBackReference
	private Paciente paciente;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IdOdontologo")
	@JsonBackReference
	private Odontologo odontologo;

	
	public RecetaMedica() {}
	public RecetaMedica( String descripcion, Date fecha_Actual, Paciente paciente,
			Odontologo odontologo) {
		super();
		Descripcion = descripcion;
		this.Fecha_Actual = fecha_Actual;
		this.paciente = paciente;
		this.odontologo = odontologo;
	}

	public int getIdReceta() {
		return IdReceta;
	}

	public void setIdReceta(int idReceta) {
		IdReceta = idReceta;
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
