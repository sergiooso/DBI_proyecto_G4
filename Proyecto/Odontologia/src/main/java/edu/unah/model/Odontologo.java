package edu.unah.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Odontologo")
public class Odontologo {
	
	@Id
	private int Id_Odontologo;
	
	private String Especialidad;
	private String Pri_Nombre;
	private String Seg_Nombre;
	private String Pri_Apellido;
	private String Seg_Apellido;
	
	@OneToOne
	@JoinColumn (name="Id_Sucursal")
	@JsonBackReference
	private Sucursal sucursal;
	
	@OneToMany(mappedBy="Odontologo",fetch=FetchType.EAGER)
	private List<Expediente> expediente;
	
	@OneToMany(mappedBy="Odontologo",fetch=FetchType.EAGER)
	private List<Consulta> consulta;
	
	@OneToMany(mappedBy="Odontologo",fetch=FetchType.EAGER)
	private List<Receta_Medica> receta_medica;
	
	@OneToMany(mappedBy="Odontologo",fetch=FetchType.EAGER)
	private List<Tratamiento> tratamiento;
		
	public Odontologo() {}

}