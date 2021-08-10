package edu.unah.model;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="TBL_PACIENTE")
public class Paciente {
	@Id
	private int IdPaciente;
	
	private String PriNombre;
	private String SegNombre;
	private String PriApellido;
	private String SegApellido;
	private String Telefono;
	private String Correo;
	private String Direccion;
	private String Departamento;
	private Date Fecha_Nac;
	private String Contrasenia;
		
	@OneToOne(mappedBy = "paciente")
	private RecetaMedica recetaMedica;
	
	@OneToOne(mappedBy = "paciente")
	private Consulta consulta;
	
	@OneToOne(mappedBy = "paciente")
	private Expediente expediente;
	
	@OneToOne(mappedBy = "paciente")
	private Factura factura;
	
	public Paciente() {}
		
	public Paciente(int idPaciente, String priNombre, String segNombre, String priApellido, String segApellido,
			String telefono, String correo, String direccion, String departamento,Date fechaNac, String contrasenia) {
		super();
		this.IdPaciente = idPaciente;
		this.PriNombre = priNombre;
		this.SegNombre = segNombre;
		this.PriApellido = priApellido;
		this.SegApellido = segApellido;
		this.Telefono = telefono;
		this.Correo = correo;
		this.Direccion = direccion;
		this.Departamento=departamento;
		this.Fecha_Nac = fechaNac;
		this.Contrasenia = contrasenia;
	}
	
	public int getIdPaciente() {
		return IdPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		IdPaciente = idPaciente;
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
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public Date getFechaNac() {
		return Fecha_Nac;
	}
	public void setFechaNac(Date fechaNac) {
		Fecha_Nac = fechaNac;
	}
	public String getContrasenia() {
		return Contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	
	
	
}
