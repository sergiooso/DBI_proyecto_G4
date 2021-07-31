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
	private String Contrasenia;
	
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

	public Odontologo(int id_Odontologo, String especialidad, String pri_Nombre, String seg_Nombre, String pri_Apellido,
			String seg_Apellido, String contrasenia, Sucursal sucursal, List<Expediente> expediente,
			List<Consulta> consulta, List<Receta_Medica> receta_medica, List<Tratamiento> tratamiento) {
		super();
		Id_Odontologo = id_Odontologo;
		Especialidad = especialidad;
		Pri_Nombre = pri_Nombre;
		Seg_Nombre = seg_Nombre;
		Pri_Apellido = pri_Apellido;
		Seg_Apellido = seg_Apellido;
		Contrasenia = contrasenia;
		this.sucursal = sucursal;
		this.expediente = expediente;
		this.consulta = consulta;
		this.receta_medica = receta_medica;
		this.tratamiento = tratamiento;
	}

	public int getId_Odontologo() {
		return Id_Odontologo;
	}

	public void setId_Odontologo(int id_Odontologo) {
		Id_Odontologo = id_Odontologo;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}

	public String getPri_Nombre() {
		return Pri_Nombre;
	}

	public void setPri_Nombre(String pri_Nombre) {
		Pri_Nombre = pri_Nombre;
	}

	public String getSeg_Nombre() {
		return Seg_Nombre;
	}

	public void setSeg_Nombre(String seg_Nombre) {
		Seg_Nombre = seg_Nombre;
	}

	public String getPri_Apellido() {
		return Pri_Apellido;
	}

	public void setPri_Apellido(String pri_Apellido) {
		Pri_Apellido = pri_Apellido;
	}

	public String getSeg_Apellido() {
		return Seg_Apellido;
	}

	public void setSeg_Apellido(String seg_Apellido) {
		Seg_Apellido = seg_Apellido;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public List<Expediente> getExpediente() {
		return expediente;
	}

	public void setExpediente(List<Expediente> expediente) {
		this.expediente = expediente;
	}

	public List<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}

	public List<Receta_Medica> getReceta_medica() {
		return receta_medica;
	}

	public void setReceta_medica(List<Receta_Medica> receta_medica) {
		this.receta_medica = receta_medica;
	}

	public List<Tratamiento> getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(List<Tratamiento> tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	

}