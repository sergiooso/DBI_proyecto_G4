package edu.unah.model;




import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="TBL_ODONTOLOGO")
public class Odontologo {
	
	
	@Id
	private int IdOdontologo;
	
	private String Especialidad;
	private String PriNombre;
	private String SegNombre;
	private String PriApellido;
	private String SegApellido;
	private String Contrasenia;
	
	@OneToOne
	@JoinColumn(name="IdSucursal")
	@JsonBackReference
	private Sucursal Sucursal;
	
	@OneToMany(mappedBy = "odontologo", fetch=FetchType.LAZY)
	 List<Consulta> consulta;
	
	@JsonIgnoreProperties("odontologo")
	@OneToMany(mappedBy = "odontologo", cascade = CascadeType.ALL)
	private Set<Expediente> expediente = new HashSet<>();
	
	public Odontologo() {}
	


	public Odontologo(int idOdontologo, String especialidad, String priNombre, String segNombre, String priApellido,
			String segApellido, String contrasenia, Sucursal sucursal) {
		super();
		this.IdOdontologo = idOdontologo;
		this.Especialidad = especialidad;
		this.PriNombre = priNombre;
		this.SegNombre = segNombre;
		this.PriApellido = priApellido;
		this.SegApellido = segApellido;
		this.Contrasenia = contrasenia;
		this.Sucursal = sucursal;
	}


	public int getId_Odontologo() {
		return IdOdontologo;
	}


	public void setId_Odontologo(int idOdontologo) {
		IdOdontologo = idOdontologo;
	}


	public String getEspecialidad() {
		return Especialidad;
	}


	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}


	public String getPriNombre() {
		return PriNombre;
	}


	public void setPriNombre(String priNombre) {
		PriNombre = priNombre;
	}


	public String getSegNombre() {
		return SegNombre;
	}


	public void setSegNombre(String segNombre) {
		SegNombre = segNombre;
	}


	public String getPriApellido() {
		return PriApellido;
	}


	public void setPriApellido(String priApellido) {
		PriApellido = priApellido;
	}


	public String getSegApellido() {
		return SegApellido;
	}


	public void setSegApellido(String segApellido) {
		SegApellido = segApellido;
	}


	public String getContrasenia() {
		return Contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}


	public Sucursal getSucursal() {
		return Sucursal;
	}


	public void setSucursal(Sucursal sucursal) {
		Sucursal = sucursal;
	}
	
	
}
